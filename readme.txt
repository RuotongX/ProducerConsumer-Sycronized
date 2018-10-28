Team work
Student:
Ruotong Xu 16935995
Yiwen Lu 15907151

Main.java, Buffer.java, Producer.java, Consumber.java, Constants.java

for task 2 just import the project into the eclipse and run, then follow the output message, the program can works.


Running result analysis
Question 1
The output is below, the buffer has not been full, because the number of the items in the buffer are usually 1 and 0,which means never get to 5 items.

Please input the producer number
1
Please input the consumer number
1
Please input the sleep time
10
The producer number is 1
The consumer number is 1
The sleep time is 10
Producer Thread 10
The value of the produced item is: 798469323
The number of items currently in the buffer is 1

Consumer Thread 11
The value of the consumed item is: 798469323
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 588408490
The number of items currently in the buffer is 1

Consumer Thread 11
The value of the consumed item is: 588408490
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 1264469419
The number of items currently in the buffer is 1

Consumer Thread 11
The value of the consumed item is: 1264469419
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 2058159399
The number of items currently in the buffer is 1

Consumer Thread 11
The value of the consumed item is: 2058159399
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 2067856345
The number of items currently in the buffer is 1

Consumer Thread 11
The value of the consumed item is: 2067856345
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 1919074674
The number of items currently in the buffer is 1

Consumer Thread 11
The value of the consumed item is: 1919074674
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 2114450222
The number of items currently in the buffer is 1

Consumer Thread 11
The value of the consumed item is: 2114450222
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 2030406385
The number of items currently in the buffer is 1

Consumer Thread 11
The value of the consumed item is: 2030406385
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 309000371
The number of items currently in the buffer is 1

Consumer Thread 11
The value of the consumed item is: 309000371
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 467375873
The number of items currently in the buffer is 1

Consumer Thread 11
The value of the consumed item is: 467375873
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 955937157
The number of items currently in the buffer is 1

Consumer Thread 11
The value of the consumed item is: 955937157
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 624832436
The number of items currently in the buffer is 1

Consumer Thread 11
The value of the consumed item is: 624832436
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 571807186
The number of items currently in the buffer is 1

Producer Thread 10
The value of the produced item is: 1483832216
The number of items currently in the buffer is 2

Producer Thread 10
The value of the produced item is: 1039604223
The number of items currently in the buffer is 3

Consumer Thread 11
The value of the consumed item is: 571807186
The number of items currently in the buffer is 2

Producer Thread 10
The value of the produced item is: 1949806770
The number of items currently in the buffer is 3

Consumer Thread 11
The value of the consumed item is: 1483832216
The number of items currently in the buffer is 2

Consumer Thread 11
The value of the consumed item is: 1039604223
The number of items currently in the buffer is 1

Producer Thread 10
The value of the produced item is: 1305970668
The number of items currently in the buffer is 2




Question 2
The running output is below. The producer and consumer are running alternatively,
because the buffer size is 1, and the only two states of buffer are empty and full, I used the Semaphore 'empty' and 'full' to acquire which is lock when the buffer is full or empty, so that the producer or consumer must add or delete the item in this buffer so that the lock will be released, it can keep the operation. The result is one produce then one consume, keep doing that order, the producer is locked when the buffer is full, the consumer is locked when buffer is empty.



Please input the producer number
5
Please input the consumer number
5
Please input the sleep time
10
The producer number is 5
The consumer number is 5
The sleep time is 10
Producer Thread 14
The value of the produced item is: 363308898
The number of items currently in the buffer is 1

Consumer Thread 17
The value of the consumed item is: 363308898
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 1074489952
The number of items currently in the buffer is 1

Consumer Thread 16
The value of the consumed item is: 1074489952
The number of items currently in the buffer is 0

Producer Thread 12
The value of the produced item is: 1634494383
The number of items currently in the buffer is 1

Consumer Thread 19
The value of the consumed item is: 1634494383
The number of items currently in the buffer is 0

Producer Thread 12
The value of the produced item is: 1129538353
The number of items currently in the buffer is 1

Consumer Thread 18
The value of the consumed item is: 1129538353
The number of items currently in the buffer is 0

Producer Thread 12
The value of the produced item is: 933500491
The number of items currently in the buffer is 1

Consumer Thread 15
The value of the consumed item is: 933500491
The number of items currently in the buffer is 0

Producer Thread 14
The value of the produced item is: 1850452463
The number of items currently in the buffer is 1

Consumer Thread 16
The value of the consumed item is: 1850452463
The number of items currently in the buffer is 0

Producer Thread 13
The value of the produced item is: 1407052820
The number of items currently in the buffer is 1

Consumer Thread 19
The value of the consumed item is: 1407052820
The number of items currently in the buffer is 0

Producer Thread 11
The value of the produced item is: 362333760
The number of items currently in the buffer is 1

Consumer Thread 17
The value of the consumed item is: 362333760
The number of items currently in the buffer is 0

Producer Thread 11
The value of the produced item is: 1123933521
The number of items currently in the buffer is 1

Consumer Thread 16
The value of the consumed item is: 1123933521
The number of items currently in the buffer is 0

Producer Thread 12
The value of the produced item is: 1366379014
The number of items currently in the buffer is 1

Consumer Thread 18
The value of the consumed item is: 1366379014
The number of items currently in the buffer is 0

Producer Thread 12
The value of the produced item is: 488834773
The number of items currently in the buffer is 1

Consumer Thread 19
The value of the consumed item is: 488834773
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 1426542036
The number of items currently in the buffer is 1

Consumer Thread 16
The value of the consumed item is: 1426542036
The number of items currently in the buffer is 0

Producer Thread 13
The value of the produced item is: 1928169681
The number of items currently in the buffer is 1

Consumer Thread 16
The value of the consumed item is: 1928169681
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 1583928865
The number of items currently in the buffer is 1

Consumer Thread 15
The value of the consumed item is: 1583928865
The number of items currently in the buffer is 0

Producer Thread 12
The value of the produced item is: 1543584865
The number of items currently in the buffer is 1

Consumer Thread 17
The value of the consumed item is: 1543584865
The number of items currently in the buffer is 0

Producer Thread 14
The value of the produced item is: 620069085
The number of items currently in the buffer is 1

Consumer Thread 16
The value of the consumed item is: 620069085
The number of items currently in the buffer is 0

Producer Thread 14
The value of the produced item is: 25108102
The number of items currently in the buffer is 1

Consumer Thread 16
The value of the consumed item is: 25108102
The number of items currently in the buffer is 0

Producer Thread 11
The value of the produced item is: 1136536032
The number of items currently in the buffer is 1

Consumer Thread 15
The value of the consumed item is: 1136536032
The number of items currently in the buffer is 0

Producer Thread 12
The value of the produced item is: 991855885
The number of items currently in the buffer is 1

Consumer Thread 18
The value of the consumed item is: 991855885
The number of items currently in the buffer is 0

Producer Thread 13
The value of the produced item is: 1727230020
The number of items currently in the buffer is 1

Consumer Thread 16
The value of the consumed item is: 1727230020
The number of items currently in the buffer is 0

Producer Thread 14
The value of the produced item is: 174715954
The number of items currently in the buffer is 1

Consumer Thread 17
The value of the consumed item is: 174715954
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 271170886
The number of items currently in the buffer is 1

Consumer Thread 19
The value of the consumed item is: 271170886
The number of items currently in the buffer is 0

Producer Thread 12
The value of the produced item is: 83066146
The number of items currently in the buffer is 1

Consumer Thread 15
The value of the consumed item is: 83066146
The number of items currently in the buffer is 0

Producer Thread 14
The value of the produced item is: 1304984073
The number of items currently in the buffer is 1

Consumer Thread 18
The value of the consumed item is: 1304984073
The number of items currently in the buffer is 0

Producer Thread 12
The value of the produced item is: 903571656
The number of items currently in the buffer is 1

Consumer Thread 16
The value of the consumed item is: 903571656
The number of items currently in the buffer is 0

Producer Thread 11
The value of the produced item is: 2036111372
The number of items currently in the buffer is 1

Consumer Thread 16
The value of the consumed item is: 2036111372
The number of items currently in the buffer is 0

Producer Thread 14
The value of the produced item is: 107250333
The number of items currently in the buffer is 1

Consumer Thread 16
The value of the consumed item is: 107250333
The number of items currently in the buffer is 0

Producer Thread 13
The value of the produced item is: 588212971
The number of items currently in the buffer is 1

Consumer Thread 15
The value of the consumed item is: 588212971
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 1961129832
The number of items currently in the buffer is 1

Consumer Thread 18
The value of the consumed item is: 1961129832
The number of items currently in the buffer is 0

Producer Thread 12
The value of the produced item is: 1312664546
The number of items currently in the buffer is 1

Consumer Thread 17
The value of the consumed item is: 1312664546
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 961810173
The number of items currently in the buffer is 1

Consumer Thread 19
The value of the consumed item is: 961810173
The number of items currently in the buffer is 0

Producer Thread 11
The value of the produced item is: 341517485
The number of items currently in the buffer is 1

Consumer Thread 18
The value of the consumed item is: 341517485
The number of items currently in the buffer is 0

Producer Thread 14
The value of the produced item is: 930667357
The number of items currently in the buffer is 1

Consumer Thread 15
The value of the consumed item is: 930667357
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 652026801
The number of items currently in the buffer is 1

Consumer Thread 17
The value of the consumed item is: 652026801
The number of items currently in the buffer is 0

Producer Thread 13
The value of the produced item is: 1268519174
The number of items currently in the buffer is 1

Consumer Thread 16
The value of the consumed item is: 1268519174
The number of items currently in the buffer is 0

Producer Thread 12
The value of the produced item is: 1451027524
The number of items currently in the buffer is 1

Consumer Thread 19
The value of the consumed item is: 1451027524
The number of items currently in the buffer is 0

Producer Thread 11
The value of the produced item is: 1528671149
The number of items currently in the buffer is 1

Consumer Thread 16
The value of the consumed item is: 1528671149
The number of items currently in the buffer is 0

Producer Thread 12
The value of the produced item is: 1523572889
The number of items currently in the buffer is 1

Consumer Thread 16
The value of the consumed item is: 1523572889
The number of items currently in the buffer is 0

Producer Thread 14
The value of the produced item is: 2097581409
The number of items currently in the buffer is 1

Consumer Thread 18
The value of the consumed item is: 2097581409
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 56712179
The number of items currently in the buffer is 1

Consumer Thread 17
The value of the consumed item is: 56712179
The number of items currently in the buffer is 0

Producer Thread 13
The value of the produced item is: 1097959446
The number of items currently in the buffer is 1

Consumer Thread 15
The value of the consumed item is: 1097959446
The number of items currently in the buffer is 0

Producer Thread 14
The value of the produced item is: 821199147
The number of items currently in the buffer is 1

Consumer Thread 16
The value of the consumed item is: 821199147
The number of items currently in the buffer is 0

Producer Thread 12
The value of the produced item is: 123819421
The number of items currently in the buffer is 1

Consumer Thread 18
The value of the consumed item is: 123819421
The number of items currently in the buffer is 0

Producer Thread 13
The value of the produced item is: 360329214
The number of items currently in the buffer is 1

Consumer Thread 15
The value of the consumed item is: 360329214
The number of items currently in the buffer is 0

Producer Thread 11
The value of the produced item is: 942536747
The number of items currently in the buffer is 1

Consumer Thread 19
The value of the consumed item is: 942536747
The number of items currently in the buffer is 0

Producer Thread 11
The value of the produced item is: 1386598017
The number of items currently in the buffer is 1

Consumer Thread 16
The value of the consumed item is: 1386598017
The number of items currently in the buffer is 0

Producer Thread 11
The value of the produced item is: 1511995487
The number of items currently in the buffer is 1

Consumer Thread 18
The value of the consumed item is: 1511995487
The number of items currently in the buffer is 0

Producer Thread 13
The value of the produced item is: 15665061
The number of items currently in the buffer is 1

Consumer Thread 17
The value of the consumed item is: 15665061
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 801545292
The number of items currently in the buffer is 1

Consumer Thread 15
The value of the consumed item is: 801545292
The number of items currently in the buffer is 0

Producer Thread 14
The value of the produced item is: 1583422472
The number of items currently in the buffer is 1

Consumer Thread 17
The value of the consumed item is: 1583422472
The number of items currently in the buffer is 0

Producer Thread 12
The value of the produced item is: 1106550623
The number of items currently in the buffer is 1

Consumer Thread 17
The value of the consumed item is: 1106550623
The number of items currently in the buffer is 0

Producer Thread 11
The value of the produced item is: 1694152777
The number of items currently in the buffer is 1

Consumer Thread 16
The value of the consumed item is: 1694152777
The number of items currently in the buffer is 0

Producer Thread 13
The value of the produced item is: 1522075383
The number of items currently in the buffer is 1

Consumer Thread 15
The value of the consumed item is: 1522075383
The number of items currently in the buffer is 0

Producer Thread 11
The value of the produced item is: 1880849399
The number of items currently in the buffer is 1

Consumer Thread 19
The value of the consumed item is: 1880849399
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 103014302
The number of items currently in the buffer is 1

Consumer Thread 18
The value of the consumed item is: 103014302
The number of items currently in the buffer is 0

Producer Thread 11
The value of the produced item is: 1353561125
The number of items currently in the buffer is 1

Consumer Thread 15
The value of the consumed item is: 1353561125
The number of items currently in the buffer is 0

Producer Thread 14
The value of the produced item is: 2146283248
The number of items currently in the buffer is 1

Consumer Thread 17
The value of the consumed item is: 2146283248
The number of items currently in the buffer is 0

Producer Thread 11
The value of the produced item is: 1975299207
The number of items currently in the buffer is 1

Consumer Thread 15
The value of the consumed item is: 1975299207
The number of items currently in the buffer is 0

Producer Thread 12
The value of the produced item is: 381846873
The number of items currently in the buffer is 1

Consumer Thread 16
The value of the consumed item is: 381846873
The number of items currently in the buffer is 0

Producer Thread 14
The value of the produced item is: 1332315336
The number of items currently in the buffer is 1

Consumer Thread 19
The value of the consumed item is: 1332315336
The number of items currently in the buffer is 0

Producer Thread 13
The value of the produced item is: 625041269
The number of items currently in the buffer is 1

Consumer Thread 18
The value of the consumed item is: 625041269
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 282501301
The number of items currently in the buffer is 1

Consumer Thread 17
The value of the consumed item is: 282501301
The number of items currently in the buffer is 0

Producer Thread 11
The value of the produced item is: 993009583
The number of items currently in the buffer is 1

Consumer Thread 16
The value of the consumed item is: 993009583
The number of items currently in the buffer is 0

Producer Thread 12
The value of the produced item is: 1199375952
The number of items currently in the buffer is 1

Consumer Thread 17
The value of the consumed item is: 1199375952
The number of items currently in the buffer is 0

Producer Thread 13
The value of the produced item is: 1089424492
The number of items currently in the buffer is 1

Consumer Thread 18
The value of the consumed item is: 1089424492
The number of items currently in the buffer is 0

Producer Thread 11
The value of the produced item is: 531159278
The number of items currently in the buffer is 1

Consumer Thread 19
The value of the consumed item is: 531159278
The number of items currently in the buffer is 0

Producer Thread 13
The value of the produced item is: 1059250493
The number of items currently in the buffer is 1

Consumer Thread 15
The value of the consumed item is: 1059250493
The number of items currently in the buffer is 0

Producer Thread 14
The value of the produced item is: 623218993
The number of items currently in the buffer is 1

Consumer Thread 16
The value of the consumed item is: 623218993
The number of items currently in the buffer is 0

Producer Thread 12
The value of the produced item is: 392141853
The number of items currently in the buffer is 1

Consumer Thread 19
The value of the consumed item is: 392141853
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 1138274193
The number of items currently in the buffer is 1

Consumer Thread 17
The value of the consumed item is: 1138274193
The number of items currently in the buffer is 0

Producer Thread 11
The value of the produced item is: 1135577381
The number of items currently in the buffer is 1

Consumer Thread 18
The value of the consumed item is: 1135577381
The number of items currently in the buffer is 0

Producer Thread 13
The value of the produced item is: 663772706
The number of items currently in the buffer is 1

Consumer Thread 19
The value of the consumed item is: 663772706
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 392664065
The number of items currently in the buffer is 1

Consumer Thread 19
The value of the consumed item is: 392664065
The number of items currently in the buffer is 0

Producer Thread 14
The value of the produced item is: 730659074
The number of items currently in the buffer is 1

Consumer Thread 15
The value of the consumed item is: 730659074
The number of items currently in the buffer is 0

Producer Thread 13
The value of the produced item is: 1696828158
The number of items currently in the buffer is 1

Consumer Thread 16
The value of the consumed item is: 1696828158
The number of items currently in the buffer is 0

Producer Thread 12
The value of the produced item is: 1821292424
The number of items currently in the buffer is 1

Consumer Thread 17
The value of the consumed item is: 1821292424
The number of items currently in the buffer is 0

Producer Thread 14
The value of the produced item is: 1578758860
The number of items currently in the buffer is 1

Consumer Thread 18
The value of the consumed item is: 1578758860
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 1423182658
The number of items currently in the buffer is 1

Consumer Thread 15
The value of the consumed item is: 1423182658
The number of items currently in the buffer is 0

Producer Thread 11
The value of the produced item is: 734563287
The number of items currently in the buffer is 1

Consumer Thread 18
The value of the consumed item is: 734563287
The number of items currently in the buffer is 0

Producer Thread 12
The value of the produced item is: 2027293059
The number of items currently in the buffer is 1

Consumer Thread 19
The value of the consumed item is: 2027293059
The number of items currently in the buffer is 0

Producer Thread 13
The value of the produced item is: 437924850
The number of items currently in the buffer is 1

Consumer Thread 15
The value of the consumed item is: 437924850
The number of items currently in the buffer is 0

Producer Thread 14
The value of the produced item is: 1962481635
The number of items currently in the buffer is 1

Consumer Thread 17
The value of the consumed item is: 1962481635
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 1384302453
The number of items currently in the buffer is 1

Consumer Thread 16
The value of the consumed item is: 1384302453
The number of items currently in the buffer is 0

Producer Thread 11
The value of the produced item is: 1635794622
The number of items currently in the buffer is 1

Consumer Thread 18
The value of the consumed item is: 1635794622
The number of items currently in the buffer is 0





Question 3
The running output is below, so I did not find any rules in my running output, because the buffer size is 10, it is hard to get to the full or empty states, it can not be working as the question 2 situation, just the producer by consumer. The reason that the the number of items in buffer is random is the sleep time for each Prodecer thread and Consumer thread is random, for example if one consumer sleep time is 1000, and at same time a producer sleep time is 300,200,500, the buffer items will increase 2, we can not get when the consumers have the long sleep time or the producers have the long sleep time.





Please input the producer number
5
Please input the consumer number
5
Please input the sleep time
10
The producer number is 5
The consumer number is 5
The sleep time is 10
Producer Thread 12
The value of the produced item is: 546866526
The number of items currently in the buffer is 1

Consumer Thread 18
The value of the consumed item is: 546866526
The number of items currently in the buffer is 0

Producer Thread 12
The value of the produced item is: 2048819426
The number of items currently in the buffer is 1

Consumer Thread 18
The value of the consumed item is: 2048819426
The number of items currently in the buffer is 0

Producer Thread 11
The value of the produced item is: 388047594
The number of items currently in the buffer is 1

Consumer Thread 16
The value of the consumed item is: 388047594
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 918171732
The number of items currently in the buffer is 1

Consumer Thread 17
The value of the consumed item is: 918171732
The number of items currently in the buffer is 0

Producer Thread 14
The value of the produced item is: 207975278
The number of items currently in the buffer is 1

Consumer Thread 15
The value of the consumed item is: 207975278
The number of items currently in the buffer is 0

Producer Thread 13
The value of the produced item is: 1694416090
The number of items currently in the buffer is 1

Consumer Thread 19
The value of the consumed item is: 1694416090
The number of items currently in the buffer is 0

Producer Thread 11
The value of the produced item is: 742227979
The number of items currently in the buffer is 1

Consumer Thread 17
The value of the consumed item is: 742227979
The number of items currently in the buffer is 0

Producer Thread 11
The value of the produced item is: 549241569
The number of items currently in the buffer is 1

Consumer Thread 16
The value of the consumed item is: 549241569
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 1595602484
The number of items currently in the buffer is 1

Consumer Thread 18
The value of the consumed item is: 1595602484
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 1804433141
The number of items currently in the buffer is 1

Consumer Thread 17
The value of the consumed item is: 1804433141
The number of items currently in the buffer is 0

Producer Thread 12
The value of the produced item is: 1842044486
The number of items currently in the buffer is 1

Consumer Thread 16
The value of the consumed item is: 1842044486
The number of items currently in the buffer is 0

Producer Thread 14
The value of the produced item is: 241493018
The number of items currently in the buffer is 1

Consumer Thread 15
The value of the consumed item is: 241493018
The number of items currently in the buffer is 0

Producer Thread 14
The value of the produced item is: 398714055
The number of items currently in the buffer is 1

Consumer Thread 15
The value of the consumed item is: 398714055
The number of items currently in the buffer is 0

Producer Thread 13
The value of the produced item is: 1964723719
The number of items currently in the buffer is 1

Consumer Thread 15
The value of the consumed item is: 1964723719
The number of items currently in the buffer is 0

Producer Thread 11
The value of the produced item is: 1325246418
The number of items currently in the buffer is 1

Consumer Thread 19
The value of the consumed item is: 1325246418
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 893627125
The number of items currently in the buffer is 1

Producer Thread 13
Consumer Thread 17
The value of the produced item is: 1603171442
The value of the consumed item is: 893627125
The number of items currently in the buffer is 1

The number of items currently in the buffer is 1

Consumer Thread 18
The value of the consumed item is: 1603171442
The number of items currently in the buffer is 0

Producer Thread 12
The value of the produced item is: 552256013
The number of items currently in the buffer is 1

Consumer Thread 16
The value of the consumed item is: 552256013
The number of items currently in the buffer is 0

Producer Thread 14
The value of the produced item is: 844248040
The number of items currently in the buffer is 1

Consumer Thread 15
The value of the consumed item is: 844248040
The number of items currently in the buffer is 0

Producer Thread 11
The value of the produced item is: 763413940
The number of items currently in the buffer is 1

Consumer Thread 18
The value of the consumed item is: 763413940
The number of items currently in the buffer is 0

Producer Thread 14
The value of the produced item is: 59774708
The number of items currently in the buffer is 1

Consumer Thread 17
The value of the consumed item is: 59774708
The number of items currently in the buffer is 0

Producer Thread 14
Producer Thread 13
The value of the produced item is: 1518375790
The number of items currently in the buffer is 2

Consumer Thread 16
The value of the consumed item is: 1035354754
The number of items currently in the buffer is 1

The value of the produced item is: 1035354754
The number of items currently in the buffer is 1

Producer Thread 14
The value of the produced item is: 451073463
The number of items currently in the buffer is 2

Consumer Thread 17
The value of the consumed item is: 1518375790
The number of items currently in the buffer is 1

Consumer Thread 19
The value of the consumed item is: 451073463
The number of items currently in the buffer is 0

Producer Thread 13
The value of the produced item is: 1363675539
The number of items currently in the buffer is 1

Consumer Thread 16
The value of the consumed item is: 1363675539
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 437343209
The number of items currently in the buffer is 1

Consumer Thread 17
The value of the consumed item is: 437343209
The number of items currently in the buffer is 0

Producer Thread 10
The value of the produced item is: 1571944796
The number of items currently in the buffer is 1

Consumer Thread 19
The value of the consumed item is: 1571944796
The number of items currently in the buffer is 0

Producer Thread 12
The value of the produced item is: 2113393017
The number of items currently in the buffer is 1

Consumer Thread 15
The value of the consumed item is: 2113393017
The number of items currently in the buffer is 0

Producer Thread 12
The value of the produced item is: 145330631
The number of items currently in the buffer is 1

Consumer Thread 19
The value of the consumed item is: 145330631
The number of items currently in the buffer is 0

Producer Thread 14
The value of the produced item is: 309136725
The number of items currently in the buffer is 1

Consumer Thread 18
The value of the consumed item is: 309136725
The number of items currently in the buffer is 0

Producer Thread 11
The value of the produced item is: 1517121771
The number of items currently in the buffer is 1

Consumer Thread 15
The value of the consumed item is: 1517121771
The number of items currently in the buffer is 0

Producer Thread 14
The value of the produced item is: 754323367
The number of items currently in the buffer is 1

Producer Thread 13
The value of the produced item is: 342415538
The number of items currently in the buffer is 2

Producer Thread 12
The value of the produced item is: 491553253
The number of items currently in the buffer is 3

Producer Thread 14
The value of the produced item is: 674366676
The number of items currently in the buffer is 4

Consumer Thread 16
The value of the consumed item is: 754323367
The number of items currently in the buffer is 3

Consumer Thread 17
The value of the consumed item is: 342415538
The number of items currently in the buffer is 2

Producer Thread 12
The value of the produced item is: 214022897
The number of items currently in the buffer is 3

Consumer Thread 17
The value of the consumed item is: 491553253
The number of items currently in the buffer is 2

Producer Thread 14
The value of the produced item is: 754195995
The number of items currently in the buffer is 3

Producer Thread 11
The value of the produced item is: 1807219335
The number of items currently in the buffer is 4

Producer Thread 10
The value of the produced item is: 769149022
The number of items currently in the buffer is 5

Producer Thread 11
The value of the produced item is: 1199501079
The number of items currently in the buffer is 6

Consumer Thread 18
The value of the consumed item is: 674366676
The number of items currently in the buffer is 5

Producer Thread 13
The value of the produced item is: 1775098597
The number of items currently in the buffer is 6

Consumer Thread 16
The value of the consumed item is: 214022897
The number of items currently in the buffer is 5

Consumer Thread 16
The value of the consumed item is: 754195995
The number of items currently in the buffer is 4

Consumer Thread 19
The value of the consumed item is: 1807219335
The number of items currently in the buffer is 3

Producer Thread 12
The value of the produced item is: 886451699
The number of items currently in the buffer is 4

Producer Thread 11
The value of the produced item is: 1122229090
The number of items currently in the buffer is 5

Consumer Thread 15
The value of the consumed item is: 769149022
The number of items currently in the buffer is 4

Consumer Thread 17
The value of the consumed item is: 1199501079
The number of items currently in the buffer is 3

Producer Thread 12
The value of the produced item is: 177355879
The number of items currently in the buffer is 4

Consumer Thread 18
The value of the consumed item is: 1775098597
The number of items currently in the buffer is 3

Producer Thread 13
The value of the produced item is: 1808812190
The number of items currently in the buffer is 4

Producer Thread 11
The value of the produced item is: 1748586739
The number of items currently in the buffer is 5

Producer Thread 10
The value of the produced item is: 937908839
The number of items currently in the buffer is 6

Producer Thread 14
The value of the produced item is: 1412694714
The number of items currently in the buffer is 7

Producer Thread 10
The value of the produced item is: 454265463
The number of items currently in the buffer is 8

Consumer Thread 16
The value of the consumed item is: 886451699
The number of items currently in the buffer is 7

Producer Thread 13
The value of the produced item is: 1631070619
The number of items currently in the buffer is 8

Consumer Thread 18
The value of the consumed item is: 1122229090
The number of items currently in the buffer is 7

Consumer Thread 15
The value of the consumed item is: 177355879
The number of items currently in the buffer is 6

Producer Thread 12
The value of the produced item is: 1059239245
The number of items currently in the buffer is 7

Consumer Thread 15
The value of the consumed item is: 1808812190
The number of items currently in the buffer is 6

Producer Thread 14
The value of the produced item is: 369515074
The number of items currently in the buffer is 7

Consumer Thread 16
The value of the consumed item is: 1748586739
The number of items currently in the buffer is 6

Consumer Thread 19
The value of the consumed item is: 937908839
The number of items currently in the buffer is 5

Consumer Thread 17
The value of the consumed item is: 1412694714
The number of items currently in the buffer is 4

Producer Thread 11
The value of the produced item is: 613830912
The number of items currently in the buffer is 5

Consumer Thread 19
The value of the consumed item is: 454265463
The number of items currently in the buffer is 4

Producer Thread 10
The value of the produced item is: 2126194604
The number of items currently in the buffer is 5

Consumer Thread 19
The value of the consumed item is: 1631070619
The number of items currently in the buffer is 4

Producer Thread 11
The value of the produced item is: 108007882
The number of items currently in the buffer is 5

Producer Thread 13
The value of the produced item is: 1328700901
The number of items currently in the buffer is 6

Producer Thread 11
The value of the produced item is: 1195878711
The number of items currently in the buffer is 7

Consumer Thread 16
The value of the consumed item is: 1059239245
The number of items currently in the buffer is 6

Consumer Thread 18
The value of the consumed item is: 369515074
The number of items currently in the buffer is 5

Consumer Thread 17
The value of the consumed item is: 613830912
The number of items currently in the buffer is 4

Consumer Thread 16
The value of the consumed item is: 2126194604
The number of items currently in the buffer is 3

Consumer Thread 15
The value of the consumed item is: 108007882
The number of items currently in the buffer is 2

Producer Thread 14
The value of the produced item is: 1940071019
The number of items currently in the buffer is 3

Producer Thread 12
The value of the produced item is: 659110290
The number of items currently in the buffer is 4

Consumer Thread 16
The value of the consumed item is: 1328700901
The number of items currently in the buffer is 3

Producer Thread 12
The value of the produced item is: 831486144
The number of items currently in the buffer is 4

Producer Thread 11
The value of the produced item is: 1357197076
The number of items currently in the buffer is 5

Producer Thread 10
The value of the produced item is: 671058336
The number of items currently in the buffer is 6

Producer Thread 14
The value of the produced item is: 1991684432
The number of items currently in the buffer is 7

Producer Thread 13
The value of the produced item is: 1126302709
The number of items currently in the buffer is 8

Consumer Thread 17
The value of the consumed item is: 1195878711
The number of items currently in the buffer is 7

Consumer Thread 16
The value of the consumed item is: 1940071019
The number of items currently in the buffer is 6

Consumer Thread 19
The value of the consumed item is: 659110290
The number of items currently in the buffer is 5

Producer Thread 14
The value of the produced item is: 557874552
The number of items currently in the buffer is 6

Producer Thread 11
The value of the produced item is: 355813886
The number of items currently in the buffer is 7

Consumer Thread 15
The value of the consumed item is: 831486144
The number of items currently in the buffer is 6

Producer Thread 12
The value of the produced item is: 1837638170
The number of items currently in the buffer is 7

Consumer Thread 18
The value of the consumed item is: 1357197076
The number of items currently in the buffer is 6

Consumer Thread 16
The value of the consumed item is: 671058336
The number of items currently in the buffer is 5

Consumer Thread 18
The value of the consumed item is: 1991684432
The number of items currently in the buffer is 4

Producer Thread 12
The value of the produced item is: 418027069
The number of items currently in the buffer is 5

Producer Thread 10
The value of the produced item is: 1774720258
The number of items currently in the buffer is 6

Consumer Thread 18
The value of the consumed item is: 1126302709
The number of items currently in the buffer is 5

Consumer Thread 17
The value of the consumed item is: 557874552
The number of items currently in the buffer is 4

Producer Thread 14
The value of the produced item is: 520161747
The number of items currently in the buffer is 5

Producer Thread 13
The value of the produced item is: 1958684274
The number of items currently in the buffer is 6

Consumer Thread 15
The value of the consumed item is: 355813886
The number of items currently in the buffer is 5

Consumer Thread 19
The value of the consumed item is: 1837638170
The number of items currently in the buffer is 4

Consumer Thread 18
The value of the consumed item is: 418027069
The number of items currently in the buffer is 3

Producer Thread 11
The value of the produced item is: 861862800
The number of items currently in the buffer is 4

Producer Thread 14
The value of the produced item is: 1865805377
The number of items currently in the buffer is 5

Consumer Thread 18
The value of the consumed item is: 1774720258
The number of items currently in the buffer is 4

Producer Thread 12
The value of the produced item is: 1084056249
The number of items currently in the buffer is 5

Producer Thread 11
The value of the produced item is: 424954656
The number of items currently in the buffer is 6

Consumer Thread 16
The value of the consumed item is: 520161747
The number of items currently in the buffer is 5

Consumer Thread 19
The value of the consumed item is: 1958684274
The number of items currently in the buffer is 4

Consumer Thread 18
The value of the consumed item is: 861862800
The number of items currently in the buffer is 3

Consumer Thread 17
The value of the consumed item is: 1865805377
The number of items currently in the buffer is 2

Producer Thread 14
The value of the produced item is: 741108772
The number of items currently in the buffer is 3

Producer Thread 10
The value of the produced item is: 1850418690
The number of items currently in the buffer is 4

Consumer Thread 18
The value of the consumed item is: 1084056249
The number of items currently in the buffer is 3

Consumer Thread 15
The value of the consumed item is: 424954656
The number of items currently in the buffer is 2

Producer Thread 10
The value of the produced item is: 1001153088
The number of items currently in the buffer is 3

Producer Thread 13
The value of the produced item is: 1910707679
The number of items currently in the buffer is 4

Consumer Thread 16
The value of the consumed item is: 741108772
The number of items currently in the buffer is 3

Producer Thread 10
The value of the produced item is: 1176349970
The number of items currently in the buffer is 4

Consumer Thread 15
The value of the consumed item is: 1850418690
The number of items currently in the buffer is 3

Consumer Thread 19
The value of the consumed item is: 1001153088
The number of items currently in the buffer is 2

Consumer Thread 16
The value of the consumed item is: 1910707679
The number of items currently in the buffer is 1

Consumer Thread 17
The value of the consumed item is: 1176349970
The number of items currently in the buffer is 0

Producer Thread 12
The value of the produced item is: 331653882
The number of items currently in the buffer is 1

Producer Thread 11
The value of the produced item is: 669633017
The number of items currently in the buffer is 2

Consumer Thread 17
The value of the consumed item is: 331653882
The number of items currently in the buffer is 1

Producer Thread 12
The value of the produced item is: 1846481195
The number of items currently in the buffer is 2

Consumer Thread 19
The value of the consumed item is: 669633017
The number of items currently in the buffer is 1

Producer Thread 14
The value of the produced item is: 293345973
The number of items currently in the buffer is 2

Consumer Thread 19
The value of the consumed item is: 1846481195
The number of items currently in the buffer is 1

Consumer Thread 18
The value of the consumed item is: 293345973
The number of items currently in the buffer is 0

Producer Thread 14
The value of the produced item is: 1506869240
The number of items currently in the buffer is 1

Producer Thread 13
The value of the produced item is: 335030750
The number of items currently in the buffer is 2

Producer Thread 11
The value of the produced item is: 833339516
The number of items currently in the buffer is 3

Producer Thread 13
The value of the produced item is: 2074780087
The number of items currently in the buffer is 4

Producer Thread 10
The value of the produced item is: 1109141277
The number of items currently in the buffer is 5

Consumer Thread 16
The value of the consumed item is: 1506869240
The number of items currently in the buffer is 4

Consumer Thread 15
The value of the consumed item is: 335030750
The number of items currently in the buffer is 3

Producer Thread 14
The value of the produced item is: 334965045
The number of items currently in the buffer is 4

Producer Thread 11
The value of the produced item is: 1216825703
The number of items currently in the buffer is 5

Producer Thread 13
The value of the produced item is: 204997883
The number of items currently in the buffer is 6

Consumer Thread 19
The value of the consumed item is: 833339516
The number of items currently in the buffer is 5

Consumer Thread 17
The value of the consumed item is: 2074780087
The number of items currently in the buffer is 4

Consumer Thread 18
The value of the consumed item is: 1109141277
The number of items currently in the buffer is 3

Producer Thread 12
The value of the produced item is: 298362294
The number of items currently in the buffer is 4

Consumer Thread 18
The value of the consumed item is: 334965045
The number of items currently in the buffer is 3

Consumer Thread 15
The value of the consumed item is: 1216825703
The number of items currently in the buffer is 2

Producer Thread 14
The value of the produced item is: 258937110
The number of items currently in the buffer is 3

Producer Thread 10
The value of the produced item is: 1632554308
The number of items currently in the buffer is 4

Producer Thread 13
The value of the produced item is: 854721324
The number of items currently in the buffer is 5

Consumer Thread 17
The value of the consumed item is: 204997883
The number of items currently in the buffer is 5

Producer Thread 10
The value of the produced item is: 974732087
The number of items currently in the buffer is 5