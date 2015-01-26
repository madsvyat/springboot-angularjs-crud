package com.madsvyat.crud.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Infiltrator on 26.01.2015.
 */
@Entity
//@Indexed
@Table(name = "User")
/*@AnalyzerDef(name = "nameanalyzer",
        tokenizer = @TokenizerDef(factory = StandardTokenizerFactory.class),
        filters = {
                @TokenFilterDef(factory = LowerCaseFilterFactory.class),
                @TokenFilterDef(factory = StandardFilterFactory.class)
        }) */
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(nullable = false, length = 25)
  //  @Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
 //   @Analyzer(definition = "nameanalyzer")
    String name;
    
    @Column(name = "age")
    Integer age;
    
    @Column(name = "isAdmin")
    Boolean isAdmin;

    //    @PrePersist
   // @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "createdDate")
    Date createdDate;
    
    public Long getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
    
    public Boolean isAdmin() {
        return isAdmin;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}

