# 🚩 Java Record Class

**Java'da "record" sınıfı, Java 16 ve sonrasındaki sürümlerde eklenen bir özelliktir. Record sınıfları, veri taşıma amacıyla kullanılır ve genellikle basit veri nesneleri için tasarlanmıştır. Bir record sınıfı, sınıfın içerdiği verileri temsil eden ve bu verilere erişim için otomatik getter yöntemleri sağlayan bir sınıf türüdür. Ayrıca, "equals()", "hashCode()" ve "toString()" gibi ortak işlemleri otomatik olarak oluşturan özel bir sınıf türüdür.**

**1)** ***Veri Taşıma***: **Record sınıfları, verileri gruplamak ve bu verilere erişim sağlamak için kullanılır. Örneğin, bir kullanıcıyı temsil eden bir record sınıfı, kullanıcı adı, e-posta adresi ve diğer ilgili bilgileri içerebilir.**

**2)** ***Otomatik Getter Yöntemleri:* Record sınıfları, her veri elemanı için otomatik olarak getter yöntemlerini oluşturur. Bu, verilere erişmek için herhangi bir ek kod yazmanız gerekmediği anlamına gelir.**

![](/images/5.png)

![](/images/1.png)

![](/images/2.png)


**3)** ***equals() ve hashCode() Metodları***: **Record sınıfları, verileri karşılaştırmak için "equals()" ve "hashCode()" metodlarını otomatik olarak oluşturur. Bu, nesnelerin içeriğine dayalı karşılaştırmalar yapmayı kolaylaştırır.**

![](/images/3.png)

![](/images/4.png)


**4)** ***toString() Metodu:* Record sınıfları, "toString()" metodunu otomatik olarak oluşturur ve bu sayede nesnenin temsilini döndürerek hata ayıklama ve günlükleme işlemlerini kolaylaştırır.**

**5)** ***İmmutability (Değiştirilemezlik):* Record sınıfları, genellikle değiştirilemez nesneler olarak kullanılır. Bu nedenle, bir record nesnesi oluşturulduktan sonra içerdiği veriler değiştirilemez.**


