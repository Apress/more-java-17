String str = "Ken,Jeff,Lee";
Pattern.compile(",")
       .splitAsStream(str)
       .forEach(System.out::println);

Ken
Jeff
Lee
