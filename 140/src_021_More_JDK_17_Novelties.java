    // Circle.java
    final class Circle extends Shape {
        ...
    }

    // Rectangle.java
    final class Rectangle extends Shape {
        ...
    }

    // Shape.java
    sealed class Shape
          permits Circle, Rectangle {
        // only Circle or Rectangle can
        // inherit from Shape
        ...
    }
