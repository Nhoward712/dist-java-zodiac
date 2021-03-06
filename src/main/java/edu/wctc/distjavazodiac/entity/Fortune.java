package edu.wctc.distjavazodiac.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Fortune")
public class Fortune {
    @Id
    @Column(name = "fortune_Id")
    private int fortuneId;

    @Column(name = "text")
    private String text;
}
