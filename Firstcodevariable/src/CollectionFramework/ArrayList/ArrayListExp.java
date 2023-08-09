package CollectionFramework.ArrayList;
import java.util.ArrayList;
public class ArrayListExp {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Vrinchi");
        list.add("DAV");
        list.add("Future Star");
        System.out.println(list);
        ArrayList<Integer> li = new ArrayList<>();
        li.add(40);
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(50);
        System.out.println("For Each");
        li.set(1, 50);
        System.out.println("element "+ li.get(2));
        for (int val:li) {
            System.out.println(val+" ");

        }
        System.out.println("For loop");
        for (int i = 0; i <li.size(); i++){
            System.out.println(li.get(i)+" ");
        }
        System.out.println("Advance for each");
      li.forEach((a)-> System.out.println(a+" "));

    }}


