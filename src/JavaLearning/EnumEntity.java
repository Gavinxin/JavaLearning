package JavaLearning;
import java.time.LocalDateTime;
import java.util.List;



/**
 * @author zhangpx
 * @version 鍒涘缓鏃堕棿锛�2020骞�5鏈�12鏃� 涓嬪崍4:19:59
 * @ClassName 绫诲悕绉�
 * @Description 绫绘弿杩�
 */

public class EnumEntity {
	long id;
	private String ancestors;

	private transient String parents;

	private transient List<EnumEntity> children;
	private Long parentId;
	
	@Override
	public String toString() {
		return "EnumEntity [id=" + id + ", ancestors=" + ancestors + ", parents=" + parents + ", children=" + children
				+ ", parentId=" + parentId + "]";
	}

	public EnumEntity(long id, String ancestors, String parents, List<EnumEntity> children, Long parentId) {
		super();
		this.id = id;
		this.ancestors = ancestors;
		this.parents = parents;
		this.children = children;
		this.parentId = parentId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAncestors() {
		return ancestors;
	}

	public void setAncestors(String ancestors) {
		this.ancestors = ancestors;
	}

	public String getParents() {
		return parents;
	}

	public void setParents(String parents) {
		this.parents = parents;
	}

	public List<EnumEntity> getChildren() {
		return children;
	}

	public void setChildren(List<EnumEntity> children) {
		this.children = children;
	}
	
}

