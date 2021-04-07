import java.util.*;

public class PrintingContainers {
    static Collection fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map fill(Map<String, String> map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        return map;
    }

    //[rat, cat, dog, dog]
    //[rat, cat, dog, dog]
    //[rat, cat, dog]
    //[cat, dog, rat]
    //[rat, cat, dog]
    //{rat=Fuzzy, cat=Rags, dog=Spot}
    //{cat=Rags, dog=Spot, rat=Fuzzy}
    //{rat=Fuzzy, cat=Rags, dog=Spot}
    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<>()));//插入序
        System.out.println(fill(new LinkedList<>()));//插入序
        System.out.println(fill(new HashSet<>()));//无序//去重
        System.out.println(fill(new TreeSet<>()));//升序//去重
        System.out.println(fill(new LinkedHashSet<>()));//有序//去重
        System.out.println(fill(new HashMap<>()));//无序//键不重复
        System.out.println(fill(new TreeMap<>()));//字典序//键不重复
        System.out.println(fill(new LinkedHashMap<>()));//有序//键不重复
    }
}
