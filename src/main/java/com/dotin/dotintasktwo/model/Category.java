package com.dotin.dotintasktwo.model;


import lombok.Data;
import lombok.EqualsAndHashCode;



import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "t_category")
@Data
public class Category extends Parent implements Serializable {


//    @Enumerated(EnumType.STRING)
//    @Type(type="CategoryName")
    @Column(name = "c_category_name")
    private String categoryName;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<CategoryElement> categoryElements;


}
