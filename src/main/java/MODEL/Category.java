package MODEL;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true, length = 100)
    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.PERSIST)
    private List<Snippet> snippets = new ArrayList<>();

    public Category() {}

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<Snippet> getSnippets() { return snippets; }
    public void setSnippets(List<Snippet> snippets) { this.snippets = snippets; }
}