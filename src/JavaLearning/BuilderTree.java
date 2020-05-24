package JavaLearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import org.omg.Messaging.SyncScopeHelper;

public class BuilderTree {

	public BuilderTree() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public List<EnumEntity> create(List<EnumEntity> list){
		Map<Long,EnumEntity> map = new HashMap<>();
		for (int i = 0; i < list.size(); i++) {
			map.put(list.get(i).getId(), list.get(i));
		}
		for (int i = 0; i < list.size(); i++) {
			EnumEntity e = list.get(i);
			if(map.containsKey(e.getParentId())) {
				EnumEntity temp = map.get(e.getParentId());
				List<EnumEntity> templist = temp.getChildren();
				templist.add(e);
				temp.setChildren(templist);
				map.put(temp.getId(), temp);
			}
		}
		return map.values().stream().filter(v-> Objects.isNull( v.getParentId())).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		EnumEntity e1 = new EnumEntity(1, null, null, new ArrayList<EnumEntity>(), null);
		EnumEntity e2 = new EnumEntity(2, null, null, new ArrayList<EnumEntity>(), 1L);
		EnumEntity e3 = new EnumEntity(3, null, null, new ArrayList<EnumEntity>(), 1L);
		EnumEntity e4 = new EnumEntity(4, null, null, new ArrayList<EnumEntity>(), 2L);
		EnumEntity e5 = new EnumEntity(5, null, null, new ArrayList<EnumEntity>(), 3L);
		EnumEntity e6 = new EnumEntity(6, null, null, new ArrayList<EnumEntity>(), 1L);
		EnumEntity e7 = new EnumEntity(7, null, null, new ArrayList<EnumEntity>(), 2L);
		EnumEntity e8 = new EnumEntity(8, null, null, new ArrayList<EnumEntity>(), 4L);
		List<EnumEntity> list = new ArrayList<>();
		list.add(e8);
		list.add(e7);
		list.add(e6);
		list.add(e5);
		list.add(e4);
		list.add(e3);
		list.add(e2);
		list.add(e1);
		BuilderTree b = new BuilderTree();
		List<EnumEntity> res = b.create(list);
		res.stream().forEach(System.out::println);
	}
}


