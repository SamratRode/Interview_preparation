import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //question 1
        //Remove duplicate elements from a strem
        ArrayList<Integer> al=new ArrayList<>();
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);
        al.add(6);
        al.add(5);
        al.add(6);

        List<Integer> result=al.
                stream().
                distinct().
                collect(Collectors.toList());
        System.out.println(result);

        //Question 2
        // Reverse each word of string
        List<String> fruits= Arrays.asList("apple","mango","banana","orange");
        List<String> stiurf=fruits.
                stream().
                map((f)-> new StringBuilder(f).reverse().toString())
                .peek(fruit -> System.out.println(fruit))
                .collect(Collectors.toList());
        System.out.println(stiurf);

        //question 3
        //second largest number in the list of integers
        Integer secondLargest= al.
                stream().
                sorted((x,y)->(y-x))
                .skip(1)
                .limit(1)
                .collect(Collectors.toList()).get(0);
        System.out.println(secondLargest);

        //question 4
        //find frequency of each character in a given string
        String sentence="Yeh shyaam mastaani, mujhe dor koi kheeche teri or liye jaye";
        Map<Character, Long> frequencyTable=sentence.toLowerCase().chars().mapToObj((c)->(char)c)
                .collect(
                        Collectors.groupingBy(
                                a-> a,Collectors.counting()
                        )
                );
        System.out.println(frequencyTable);

        //Question 5
        //Min and max
        Integer max=al.
                stream().
                mapToInt(Integer::intValue)
                .max()
                .getAsInt();
        System.out.println(max);
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee(1,"Samrat",24, 2500000,List.of("DORA","Navigators")));
        employees.add(new Employee(1,"Kriti",23, 1500000, List.of("testing1","testing2")));
        employees.add(new Employee(1,"emp1",25, 4500000, List.of("anj1","anj2")));
        employees.add(new Employee(1,"emp2",23, 5500000,List.of("int1","int2")));
        List<Employee> sortScene=employees.
                stream().
                sorted((o1,o2)->(o1.getSalary()-o2.getSalary())).
                collect(Collectors.toList());
        System.out.println(sortScene);
//        Collections.sort(employees, (o1,o2)->o1.getSalary()- o2.getSalary());
        //Question 6
        //Even elements
                al.
                stream().
                filter((x)->x%2==0)
                .forEach(a->System.out.print(a+" "));

        //Question 7
        //Find avg
        double avg=al.
                stream().
                mapToInt(n->n.intValue()).
                average().
                getAsDouble();
        System.out.println(avg);

        //Question 8
        //group by age

        Map<Integer, List<Employee>> map=employees.
                stream().
                collect( Collectors.groupingBy(e->e.getAge()));

        map.forEach((k,v)-> System.out.println(k+" "+v));

        //flatmap, entry Set Example remaining
        //odd even partition
        Map<Boolean,List<Integer>> partitioned=al.stream().
                collect(Collectors.partitioningBy((x)->x%2==0));

        List<Integer> even=partitioned.get(true);
        System.out.println(even);

        List<String> allProjects=employees.
                stream().
                flatMap(e->e.getProjects().stream()).
                distinct().
                peek(a-> System.out.println(a)).toList();
    }









}
