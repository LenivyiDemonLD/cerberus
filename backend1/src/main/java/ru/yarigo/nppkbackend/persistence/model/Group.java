package ru.yarigo.nppkbackend.persistence.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
@Table(name = "groups")
public class Group {
    @Id
    @Column(name = "id", nullable = false)
    @EqualsAndHashCode.Include
    @ToString.Include
    private Long id;

    @Column(name = "name", nullable = false)
    @ToString.Include
    private String name;

    @Column(name = "description")
    @ToString.Include
    private String description;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "groups")
    private Set<Profile> profiles = new HashSet<>();
}
