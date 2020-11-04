package com.javaguru.student_igors_jurkovs.lesson_10.level_3_junior.task_10;

import java.util.Optional;

public interface DatabaseV2 {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);

}
