
## Thread

Bir process’in birden fazla işi aynı anda yapmasını sağlayan yapılara thread denir. Bir process bünyesinde bir ya da birden fazla thread barındırabilir. Thread’ler aynı anda sadece tek bir iş yapabilir. Kısaca N adet thread N adet iş yapabilir diyebiliriz. Thread’ler aynı zamanda ligth-weight process (hafif siklet proses) olarak da nitelendirilebilir.    

## Thread Yaşam Döngüsü

İşletim sistemlerinde thread oluşturma işlemleri, Windows için CreateThread fonksiyonu ile yapılırken, Unix sistemlerde ise pthread_create() isimli POSIX fonksiyonu ile yapılmaktadır.

Thread’ler programlama dillerinin sunduğu çeşitli fonksiyon ve sınıflarla da yaratılabilir.Her thread oluşturulmasından sonlandırılmasına kadar geçen süreçte farklı durumlara sahip olur.

## Multithreading Neden Kullanılır 


```
 - Temel nedeni performansı arttırmaktır. 
 - Multithreading aynı zamanda bilgi işlem kaynaklarının en aza indirilmesine ve daha verimli kullanılmasına yol açar. Bir iş parçacığından gelen istekler, diğer iş parçacıklarından gelen istekleri engellemediğinden, uygulama yanıt hızı artırılmıştır.

```

##  Multithreading Avantajları 

<ul>
    <li> Threadler bağımsız olduğu için kullanıcıyı engellemez ve aynı anda birden fazla işlem yapabilirsiniz </li>
    <li> Bir çok #### işlemi bir arada gerçekleştirebilir, zamandan tasarruf sağlar #### .</li>
    <li>liste 3</li>
</ul>












## Referanslar
https://devnot.com/2021/thread-nedir-detayli-bir-thread-incelemesi/

