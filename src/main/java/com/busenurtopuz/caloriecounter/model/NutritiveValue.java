package com.busenurtopuz.caloriecounter.model;

import lombok.*;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@ToString
@EqualsAndHashCode
@Getter


public class NutritiveValue {

    private float calorie;
    private float carbohydrate;
    private float protein;
    private float fat;
}
