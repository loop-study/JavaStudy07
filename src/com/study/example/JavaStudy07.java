package com.study.example;

import com.study.test.*;

// 7주차 : 패키지
public class JavaStudy07 {

    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.fly();

        // FQCN 방식. 풀경로를 입력해버린다.
        // com.study.test.Car car = new com.study.test.Car();

        // import 방식. 상단 패키지 아래에 import 키워드선언 후 FQCN 으로 적어준다.
        Car car = new Car();
        car.move();
    }
}
