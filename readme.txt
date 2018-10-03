Running result analysis
Question 1
The output is below, the buffer has not been full, because the number of the items in the buffer are usually 1,which means never get to 5 items.

Producer number is 1
Consumer number is 1
The sleeping time is 235
ThreadID 11
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 293
ThreadID 10
The value of the produced item is: 1033768902
The number of items currently in the buffer is 1

The sleeping time is 677
ThreadID 10
The value of the produced item is: 73157516
The number of items currently in the buffer is 2

The sleeping time is 888
ThreadID 11
The value of the consumed item is: 1033768902
The number of items currently in the buffer is 1

The sleeping time is 312
ThreadID 10
The value of the produced item is: 1856783585
The number of items currently in the buffer is 2

The sleeping time is 639
ThreadID 11
The value of the consumed item is: 73157516
The number of items currently in the buffer is 1

The sleeping time is 645
ThreadID 10
The value of the produced item is: 1701551998
The number of items currently in the buffer is 2

The sleeping time is 697
ThreadID 11
The value of the consumed item is: 1856783585
The number of items currently in the buffer is 1

The sleeping time is 710
ThreadID 10
The value of the produced item is: 2028723639
The number of items currently in the buffer is 2

The sleeping time is 199
ThreadID 11
The value of the consumed item is: 1701551998
The number of items currently in the buffer is 1

The sleeping time is 329
ThreadID 11
The value of the consumed item is: 2028723639
The number of items currently in the buffer is 0

The sleeping time is 362
ThreadID 11
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 84
ThreadID 11
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 875
ThreadID 10
The value of the produced item is: 558925587
The number of items currently in the buffer is 1

The sleeping time is 490
ThreadID 10
The value of the produced item is: 1654987815
The number of items currently in the buffer is 2

The sleeping time is 659
ThreadID 11
The value of the consumed item is: 558925587
The number of items currently in the buffer is 1

The sleeping time is 371
ThreadID 10
The value of the produced item is: 491421802
The number of items currently in the buffer is 2

The sleeping time is 568
ThreadID 11
The value of the consumed item is: 1654987815
The number of items currently in the buffer is 1

The sleeping time is 410
ThreadID 11
The value of the consumed item is: 491421802
The number of items currently in the buffer is 0

The sleeping time is 149
ThreadID 11
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 913
ThreadID 10
The value of the produced item is: 709868141
The number of items currently in the buffer is 1

The sleeping time is 674
ThreadID 11
The value of the consumed item is: 709868141
The number of items currently in the buffer is 0

The sleeping time is 974
ThreadID 10
The value of the produced item is: 1939929977
The number of items currently in the buffer is 1

The sleeping time is 897
ThreadID 11
The value of the consumed item is: 1939929977
The number of items currently in the buffer is 0

The sleeping time is 708
ThreadID 10
The value of the produced item is: 240382265
The number of items currently in the buffer is 1

The sleeping time is 254
ThreadID 11
The value of the consumed item is: 240382265
The number of items currently in the buffer is 0

The sleeping time is 353
ThreadID 10
The value of the produced item is: 2110512818
The number of items currently in the buffer is 1

The sleeping time is 32
ThreadID 10
The value of the produced item is: 345474411
The number of items currently in the buffer is 2

The sleeping time is 315
ThreadID 11
The value of the consumed item is: 2110512818
The number of items currently in the buffer is 1

The sleeping time is 278
ThreadID 11
The value of the consumed item is: 345474411
The number of items currently in the buffer is 0

The sleeping time is 802
ThreadID 10
The value of the produced item is: 1570204753
The number of items currently in the buffer is 1

The sleeping time is 666
ThreadID 11
The value of the consumed item is: 1570204753
The number of items currently in the buffer is 0

The sleeping time is 631
ThreadID 10
The value of the produced item is: 887863150
The number of items currently in the buffer is 1

The sleeping time is 983
ThreadID 11
The value of the consumed item is: 887863150
The number of items currently in the buffer is 0

The sleeping time is 965
ThreadID 10
The value of the produced item is: 961868357
The number of items currently in the buffer is 1

The sleeping time is 604
ThreadID 11
The value of the consumed item is: 961868357
The number of items currently in the buffer is 0

The sleeping time is 207
ThreadID 10
The value of the produced item is: 1873055278
The number of items currently in the buffer is 1

The sleeping time is 112
ThreadID 11
The value of the consumed item is: 1873055278
The number of items currently in the buffer is 0

The sleeping time is 564
ThreadID 10
The value of the produced item is: 1318473400
The number of items currently in the buffer is 1

The sleeping time is 417
ThreadID 10
The value of the produced item is: 191862711
The number of items currently in the buffer is 2

The sleeping time is 996
ThreadID 11
The value of the consumed item is: 1318473400
The number of items currently in the buffer is 1

The sleeping time is 234
ThreadID 11
The value of the consumed item is: 191862711
The number of items currently in the buffer is 0

The sleeping time is 437
ThreadID 10
The value of the produced item is: 881390397
The number of items currently in the buffer is 1

The sleeping time is 481
ThreadID 11
The value of the consumed item is: 881390397
The number of items currently in the buffer is 0

The sleeping time is 372
ThreadID 10
The value of the produced item is: 310892908
The number of items currently in the buffer is 1

The sleeping time is 421
ThreadID 10
The value of the produced item is: 459649173
The number of items currently in the buffer is 2

The sleeping time is 732
ThreadID 11
The value of the consumed item is: 310892908
The number of items currently in the buffer is 1




Question 2
The running output is below. The producer and consumer are not running alternatively,
because Thread are not in order. There are many thread and there is only one space in buffer, there is high percetage that the buffer has nothing to remove or insert.



Producer number is 5
Consumer number is 5
The sleeping time is 866
ThreadID 13
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 1
ThreadID 13
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 427
ThreadID 11
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 896
ThreadID 14
The value of the produced item is: 354064574
The number of items currently in the buffer is 1

The sleeping time is 721
ThreadID 19
The value of the consumed item is: 354064574
The number of items currently in the buffer is 0

The sleeping time is 116
ThreadID 14
The value of the produced item is: 1033003880
The number of items currently in the buffer is 1

The sleeping time is 687
ThreadID 10
The buffer is full.
The number of items currently in the buffer is 1

The sleeping time is 105
ThreadID 19
The value of the consumed item is: 1033003880
The number of items currently in the buffer is 0

The sleeping time is 687
ThreadID 16
The value of the produced item is: 123153055
The number of items currently in the buffer is 1

The sleeping time is 628
ThreadID 13
The value of the consumed item is: 123153055
The number of items currently in the buffer is 0

The sleeping time is 970
ThreadID 15
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 593
ThreadID 11
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 964
ThreadID 14
The value of the produced item is: 1371190746
The number of items currently in the buffer is 1

The sleeping time is 123
ThreadID 17
The value of the consumed item is: 1371190746
The number of items currently in the buffer is 0

The sleeping time is 542
The sleeping time is 542
ThreadID 19
ThreadID 11
No value in the buffer right now
The number of items currently in the buffer is 0

No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 262
ThreadID 18
The value of the produced item is: 1053681468
The number of items currently in the buffer is 1

The sleeping time is 912
ThreadID 12
The buffer is full.
The number of items currently in the buffer is 1

The sleeping time is 91
ThreadID 11
The value of the consumed item is: 1053681468
The number of items currently in the buffer is 0

The sleeping time is 672
ThreadID 19
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 912
ThreadID 14
The value of the produced item is: 865749226
The number of items currently in the buffer is 1

The sleeping time is 401
ThreadID 15
The value of the consumed item is: 865749226
The number of items currently in the buffer is 0

The sleeping time is 601
ThreadID 16
The value of the produced item is: 690951379
The number of items currently in the buffer is 1

The sleeping time is 908
ThreadID 13
The value of the consumed item is: 690951379
The number of items currently in the buffer is 0

The sleeping time is 293
ThreadID 17
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 223
ThreadID 19
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 163
ThreadID 19
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 38
ThreadID 19
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 309
ThreadID 17
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 338
ThreadID 11
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 719
ThreadID 13
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 524
ThreadID 14
The value of the produced item is: 88300103
The number of items currently in the buffer is 1

The sleeping time is 176
ThreadID 18
The buffer is full.
The number of items currently in the buffer is 1

The sleeping time is 176
ThreadID 16
The buffer is full.
The number of items currently in the buffer is 1

The sleeping time is 176
ThreadID 14
The buffer is full.
The number of items currently in the buffer is 1

The sleeping time is 271
ThreadID 19
The value of the consumed item is: 88300103
The number of items currently in the buffer is 0

The sleeping time is 165
The sleeping time is 165
ThreadID 13
ThreadID 17
No value in the buffer right now
The number of items currently in the buffer is 0

No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 302
ThreadID 19
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 530
ThreadID 13
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 35
ThreadID 15
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 408
ThreadID 13
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 226
ThreadID 17
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 890
ThreadID 11
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 71
ThreadID 11
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 105
ThreadID 13
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 863
ThreadID 11
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 89
ThreadID 19
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 230
The sleeping time is 230
ThreadID 15
ThreadID 11
No value in the buffer right now
No value in the buffer right now
The number of items currently in the buffer is 0

The number of items currently in the buffer is 0

The sleeping time is 304
ThreadID 15
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 996
ThreadID 19
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 36
ThreadID 19
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 442
ThreadID 11
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 560
ThreadID 17
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 694
ThreadID 13
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 437
ThreadID 19
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 229
ThreadID 11
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 444
ThreadID 19
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 942
ThreadID 15
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 362
ThreadID 13
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 502
ThreadID 17
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 735
ThreadID 11
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 753
ThreadID 15
No value in the buffer right now
The number of items currently in the buffer is 0




Question 3
The running output is below


Producer number is 5
Consumer number is 5
The sleeping time is 279
ThreadID 16
The value of the produced item is: 910348233
The number of items currently in the buffer is 1

The sleeping time is 41
ThreadID 19
The value of the consumed item is: 910348233
The number of items currently in the buffer is 0

The sleeping time is 198
ThreadID 15
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 850
ThreadID 12
The value of the produced item is: 1523179028
The number of items currently in the buffer is 1

The sleeping time is 271
ThreadID 11
The value of the consumed item is: 1523179028
The number of items currently in the buffer is 0

The sleeping time is 891
ThreadID 17
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 151
ThreadID 19
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 279
ThreadID 18
The value of the produced item is: 111243335
The number of items currently in the buffer is 1

The sleeping time is 422
ThreadID 15
The value of the consumed item is: 111243335
The number of items currently in the buffer is 0

The sleeping time is 595
ThreadID 17
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 697
ThreadID 14
The value of the produced item is: 1447493715
The number of items currently in the buffer is 1

The sleeping time is 367
ThreadID 12
The value of the produced item is: 959803531
The number of items currently in the buffer is 2

The sleeping time is 926
ThreadID 19
The value of the consumed item is: 1447493715
The number of items currently in the buffer is 1

The sleeping time is 189
ThreadID 13
The value of the consumed item is: 959803531
The number of items currently in the buffer is 0

The sleeping time is 846
ThreadID 14
The value of the produced item is: 1439432633
The number of items currently in the buffer is 1

The sleeping time is 659
ThreadID 19
The value of the consumed item is: 1439432633
The number of items currently in the buffer is 0

The sleeping time is 495
ThreadID 16
The value of the produced item is: 459229849
The number of items currently in the buffer is 1

The sleeping time is 702
ThreadID 10
The value of the produced item is: 398440592
The number of items currently in the buffer is 2

The sleeping time is 711
ThreadID 15
The value of the consumed item is: 459229849
The number of items currently in the buffer is 1

The sleeping time is 916
ThreadID 18
The value of the produced item is: 2101942155
The number of items currently in the buffer is 2

The sleeping time is 808
ThreadID 11
The value of the consumed item is: 398440592
The number of items currently in the buffer is 1

The sleeping time is 258
ThreadID 18
The value of the produced item is: 1740525086
The number of items currently in the buffer is 2

The sleeping time is 381
ThreadID 12
The value of the produced item is: 233354011
The number of items currently in the buffer is 3

The sleeping time is 768
ThreadID 14
The value of the produced item is: 698142447
The number of items currently in the buffer is 4

The sleeping time is 899
ThreadID 17
The value of the consumed item is: 2101942155
The number of items currently in the buffer is 3

The sleeping time is 876
ThreadID 13
The value of the consumed item is: 1740525086
The number of items currently in the buffer is 2

The sleeping time is 133
ThreadID 14
The value of the produced item is: 1252611389
The number of items currently in the buffer is 3

The sleeping time is 67
ThreadID 13
The value of the consumed item is: 233354011
The number of items currently in the buffer is 2

The sleeping time is 248
ThreadID 16
The value of the produced item is: 1253674058
The number of items currently in the buffer is 3

The sleeping time is 519
ThreadID 19
The value of the consumed item is: 698142447
The number of items currently in the buffer is 2

The sleeping time is 632
ThreadID 18
The value of the produced item is: 260695017
The number of items currently in the buffer is 3

The sleeping time is 457
ThreadID 14
The value of the produced item is: 509425349
The number of items currently in the buffer is 4

The sleeping time is 848
ThreadID 15
The value of the consumed item is: 1252611389
The number of items currently in the buffer is 3

The sleeping time is 395
ThreadID 10
The value of the produced item is: 617570038
The number of items currently in the buffer is 4

The sleeping time is 687
ThreadID 11
The value of the consumed item is: 1253674058
The number of items currently in the buffer is 3

The sleeping time is 800
ThreadID 13
The value of the consumed item is: 260695017
The number of items currently in the buffer is 2

The sleeping time is 256
ThreadID 12
The value of the produced item is: 1356853749
The number of items currently in the buffer is 3

The sleeping time is 101
ThreadID 14
The value of the produced item is: 1992222754
The number of items currently in the buffer is 4

The sleeping time is 476
ThreadID 18
The value of the produced item is: 1879486781
The number of items currently in the buffer is 5

The sleeping time is 668
ThreadID 10
The value of the produced item is: 541657390
The number of items currently in the buffer is 6

The sleeping time is 119
ThreadID 13
The value of the consumed item is: 509425349
The number of items currently in the buffer is 5

The sleeping time is 257
ThreadID 12
The value of the produced item is: 817909703
The number of items currently in the buffer is 6

The sleeping time is 13
ThreadID 12
The value of the produced item is: 189266470
The number of items currently in the buffer is 7

The sleeping time is 269
ThreadID 17
The value of the consumed item is: 617570038
The number of items currently in the buffer is 6

The sleeping time is 224
ThreadID 16
The value of the produced item is: 1479472529
The number of items currently in the buffer is 7

The sleeping time is 180
ThreadID 10
The value of the produced item is: 1913440703
The number of items currently in the buffer is 8

The sleeping time is 452
ThreadID 13
The value of the consumed item is: 1356853749
The number of items currently in the buffer is 7

The sleeping time is 103
ThreadID 16
The value of the produced item is: 1860271007
The number of items currently in the buffer is 8

The sleeping time is 644
ThreadID 12
The value of the produced item is: 1519610329
The number of items currently in the buffer is 9

The sleeping time is 304
ThreadID 19
The value of the consumed item is: 1992222754
The number of items currently in the buffer is 8

The sleeping time is 566
ThreadID 15
The value of the consumed item is: 1879486781
The number of items currently in the buffer is 7

The sleeping time is 882
ThreadID 10
The value of the produced item is: 1785307471
The number of items currently in the buffer is 8

The sleeping time is 75
ThreadID 10
The value of the produced item is: 703840803
The number of items currently in the buffer is 9

The sleeping time is 125
ThreadID 14
The value of the produced item is: 1983317193
The number of items currently in the buffer is 10

The sleeping time is 45
ThreadID 14
The buffer is full.
The number of items currently in the buffer is 10

The sleeping time is 305
ThreadID 17
The value of the consumed item is: 541657390
The number of items currently in the buffer is 9

The sleeping time is 45
ThreadID 10
The value of the produced item is: 1427220364
The number of items currently in the buffer is 10

The sleeping time is 495
ThreadID 13
The value of the consumed item is: 817909703
The number of items currently in the buffer is 9

The sleeping time is 0
ThreadID 13
The value of the consumed item is: 189266470
The number of items currently in the buffer is 8

The sleeping time is 812
ThreadID 15
The value of the consumed item is: 1479472529
The number of items currently in the buffer is 7

The sleeping time is 724
ThreadID 18
The value of the produced item is: 2142561876
The number of items currently in the buffer is 8

The sleeping time is 25
The sleeping time is 959
ThreadID 18
ThreadID 11
The value of the consumed item is: 1913440703
The value of the produced item is: 1979158130
The number of items currently in the buffer is 8

The number of items currently in the buffer is 8

The sleeping time is 456
ThreadID 19
The value of the consumed item is: 1860271007
The number of items currently in the buffer is 7

The sleeping time is 542
ThreadID 16
The value of the produced item is: 210784441
The number of items currently in the buffer is 8

The sleeping time is 975
ThreadID 17
The value of the consumed item is: 1519610329
The number of items currently in the buffer is 7

The sleeping time is 151
ThreadID 11
The value of the consumed item is: 1785307471
The number of items currently in the buffer is 6

The sleeping time is 955
ThreadID 12
The value of the produced item is: 1701804026
The number of items currently in the buffer is 7

The sleeping time is 980
ThreadID 17
The value of the consumed item is: 703840803
The number of items currently in the buffer is 6

The sleeping time is 460
ThreadID 18
The value of the produced item is: 427772009
The number of items currently in the buffer is 7

The sleeping time is 480
ThreadID 10
The value of the produced item is: 1754973334
The number of items currently in the buffer is 8

The sleeping time is 783
ThreadID 13
The value of the consumed item is: 1983317193
The number of items currently in the buffer is 7

The sleeping time is 714
ThreadID 15
The value of the consumed item is: 1427220364
The number of items currently in the buffer is 6

The sleeping time is 975
ThreadID 12
The value of the produced item is: 1958509335
The number of items currently in the buffer is 7

The sleeping time is 594
ThreadID 18
The value of the produced item is: 401564026
The number of items currently in the buffer is 8

The sleeping time is 16
ThreadID 18
The value of the produced item is: 642517954
The number of items currently in the buffer is 9

The sleeping time is 379
ThreadID 19
The value of the consumed item is: 2142561876
The number of items currently in the buffer is 8

The sleeping time is 353
ThreadID 16
The value of the produced item is: 1679125339
The number of items currently in the buffer is 9

The sleeping time is 208
ThreadID 17
The value of the consumed item is: 1979158130
The number of items currently in the buffer is 8

The sleeping time is 262
ThreadID 15
The value of the consumed item is: 210784441
The number of items currently in the buffer is 7

The sleeping time is 562
ThreadID 18
The value of the produced item is: 1694405890
The number of items currently in the buffer is 8

The sleeping time is 413
ThreadID 19
The value of the consumed item is: 1701804026
The number of items currently in the buffer is 7

The sleeping time is 809
ThreadID 13
The value of the consumed item is: 427772009
The number of items currently in the buffer is 6

The sleeping time is 222
ThreadID 11
The value of the consumed item is: 1754973334
The number of items currently in the buffer is 5

The sleeping time is 910
ThreadID 12
The value of the produced item is: 368706249
The number of items currently in the buffer is 6

The sleeping time is 643
ThreadID 17
The value of the consumed item is: 1958509335
The number of items currently in the buffer is 5

The sleeping time is 581
ThreadID 10
The value of the produced item is: 1144374773
The number of items currently in the buffer is 6

The sleeping time is 158
ThreadID 13
The value of the consumed item is: 401564026
The number of items currently in the buffer is 5

The sleeping time is 249
ThreadID 17
The value of the consumed item is: 642517954
The number of items currently in the buffer is 4

The sleeping time is 651
ThreadID 15
The value of the consumed item is: 1679125339
The number of items currently in the buffer is 3

The sleeping time is 873
ThreadID 16
The value of the produced item is: 575982630
The number of items currently in the buffer is 4

The sleeping time is 387
ThreadID 13
The value of the consumed item is: 1694405890
The number of items currently in the buffer is 3

The sleeping time is 772
ThreadID 11
The value of the consumed item is: 368706249
The number of items currently in the buffer is 2

The sleeping time is 389
ThreadID 15
The value of the consumed item is: 1144374773
The number of items currently in the buffer is 1

The sleeping time is 539
ThreadID 12
The value of the produced item is: 1919263680
The number of items currently in the buffer is 2

The sleeping time is 960
ThreadID 19
The value of the consumed item is: 575982630
The number of items currently in the buffer is 1

The sleeping time is 898
ThreadID 18
The value of the produced item is: 1962620226
The number of items currently in the buffer is 2

The sleeping time is 891
ThreadID 16
The value of the produced item is: 1085544900
The number of items currently in the buffer is 3

The sleeping time is 639
ThreadID 17
The value of the consumed item is: 1919263680
The number of items currently in the buffer is 2

The sleeping time is 244
ThreadID 10
The value of the produced item is: 1689533077
The number of items currently in the buffer is 3

The sleeping time is 775
ThreadID 11
The value of the consumed item is: 1962620226
The number of items currently in the buffer is 2

The sleeping time is 36
ThreadID 10
The value of the produced item is: 675881567
The number of items currently in the buffer is 3

The sleeping time is 477
ThreadID 16
The value of the produced item is: 1450247703
The number of items currently in the buffer is 4

The sleeping time is 83
ThreadID 16
The value of the produced item is: 1283224156
The number of items currently in the buffer is 5

The sleeping time is 593
ThreadID 13
The value of the consumed item is: 1085544900
The number of items currently in the buffer is 4

The sleeping time is 715
ThreadID 19
The value of the consumed item is: 1689533077
The number of items currently in the buffer is 3

The sleeping time is 547
ThreadID 10
The value of the produced item is: 981098944
The number of items currently in the buffer is 4

The sleeping time is 461
ThreadID 12
The value of the produced item is: 1320300792
The number of items currently in the buffer is 5

The sleeping time is 555
ThreadID 15
The value of the consumed item is: 675881567
The number of items currently in the buffer is 4

The sleeping time is 110
ThreadID 11
The value of the consumed item is: 1450247703
The number of items currently in the buffer is 3

The sleeping time is 445
ThreadID 17
The value of the consumed item is: 1283224156
The number of items currently in the buffer is 2

The sleeping time is 668
ThreadID 15
The value of the consumed item is: 981098944
The number of items currently in the buffer is 1

The sleeping time is 969
ThreadID 16
The value of the produced item is: 485005207
The number of items currently in the buffer is 2

The sleeping time is 72
ThreadID 18
The value of the produced item is: 268887698
The number of items currently in the buffer is 3

The sleeping time is 246
ThreadID 16
The value of the produced item is: 1413151097
The number of items currently in the buffer is 4

The sleeping time is 19
ThreadID 16
The value of the produced item is: 1719888878
The number of items currently in the buffer is 5

The sleeping time is 888
ThreadID 13
The value of the consumed item is: 1320300792
The number of items currently in the buffer is 4

The sleeping time is 303
ThreadID 19
The value of the consumed item is: 485005207
The number of items currently in the buffer is 3

The sleeping time is 446
ThreadID 18
The value of the produced item is: 515762793
The number of items currently in the buffer is 4

The sleeping time is 630
ThreadID 10
The value of the produced item is: 1913930789
The number of items currently in the buffer is 5

The sleeping time is 714
ThreadID 11
The value of the consumed item is: 268887698
The number of items currently in the buffer is 4

The sleeping time is 771
ThreadID 13
The value of the consumed item is: 1413151097
The number of items currently in the buffer is 3

The sleeping time is 706
ThreadID 16
The value of the produced item is: 1698816910
The number of items currently in the buffer is 4

The sleeping time is 934
ThreadID 17
The value of the consumed item is: 1719888878
The number of items currently in the buffer is 3

The sleeping time is 685
ThreadID 12
The value of the produced item is: 1166830381
The number of items currently in the buffer is 4

The sleeping time is 810
ThreadID 15
The value of the consumed item is: 515762793
The number of items currently in the buffer is 3

The sleeping time is 91
ThreadID 18
The value of the produced item is: 622038733
The number of items currently in the buffer is 4

The sleeping time is 38
ThreadID 12
The value of the produced item is: 1345471233
The number of items currently in the buffer is 5

The sleeping time is 27
ThreadID 15
The value of the consumed item is: 1913930789
The number of items currently in the buffer is 4

The sleeping time is 692
ThreadID 18
The value of the produced item is: 869052675
The number of items currently in the buffer is 5

The sleeping time is 53
ThreadID 19
The value of the consumed item is: 1698816910
The number of items currently in the buffer is 4

The sleeping time is 492
ThreadID 15
The value of the consumed item is: 1166830381
The number of items currently in the buffer is 3

The sleeping time is 577
ThreadID 10
The value of the produced item is: 1968564589
The number of items currently in the buffer is 4

The sleeping time is 572
ThreadID 11
The value of the consumed item is: 622038733
The number of items currently in the buffer is 3

The sleeping time is 917
ThreadID 16
The value of the produced item is: 2132229599
The number of items currently in the buffer is 4

The sleeping time is 809
ThreadID 19
The value of the consumed item is: 1345471233
The number of items currently in the buffer is 3

The sleeping time is 929
ThreadID 17
The value of the consumed item is: 869052675
The number of items currently in the buffer is 2

The sleeping time is 296
ThreadID 13
The value of the consumed item is: 1968564589
The number of items currently in the buffer is 1

The sleeping time is 959
ThreadID 18
The value of the produced item is: 198893688
The number of items currently in the buffer is 2

The sleeping time is 500
ThreadID 15
The value of the consumed item is: 2132229599
The number of items currently in the buffer is 1

The sleeping time is 932
ThreadID 12
The value of the produced item is: 1819774811
The number of items currently in the buffer is 2

The sleeping time is 219
ThreadID 17
The value of the consumed item is: 198893688
The number of items currently in the buffer is 1

The sleeping time is 419
ThreadID 15
The value of the consumed item is: 1819774811
The number of items currently in the buffer is 0

The sleeping time is 579
ThreadID 10
The value of the produced item is: 605262701
The number of items currently in the buffer is 1

The sleeping time is 823
ThreadID 11
The value of the consumed item is: 605262701
The number of items currently in the buffer is 0

The sleeping time is 58
ThreadID 13
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 672
ThreadID 11
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 326
ThreadID 17
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 598
ThreadID 12
The value of the produced item is: 2135448277
The number of items currently in the buffer is 1

The sleeping time is 86
ThreadID 16
The value of the produced item is: 627827336
The number of items currently in the buffer is 2

The sleeping time is 979
ThreadID 12
The value of the produced item is: 350395854
The number of items currently in the buffer is 3

The sleeping time is 739
ThreadID 11
The value of the consumed item is: 2135448277
The number of items currently in the buffer is 2

The sleeping time is 5
ThreadID 11
The value of the consumed item is: 627827336
The number of items currently in the buffer is 1

The sleeping time is 747
ThreadID 19
The value of the consumed item is: 350395854
The number of items currently in the buffer is 0

The sleeping time is 935
ThreadID 18
The value of the produced item is: 399015738
The number of items currently in the buffer is 1

The sleeping time is 959
ThreadID 10
The value of the produced item is: 1511349310
The number of items currently in the buffer is 2

The sleeping time is 23
ThreadID 10
The value of the produced item is: 684950297
The number of items currently in the buffer is 3

The sleeping time is 461
ThreadID 15
The value of the consumed item is: 399015738
The number of items currently in the buffer is 2

The sleeping time is 161
ThreadID 13
The value of the consumed item is: 1511349310
The number of items currently in the buffer is 1

The sleeping time is 905
ThreadID 15
The value of the consumed item is: 684950297
The number of items currently in the buffer is 0

The sleeping time is 736
ThreadID 19
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 597
ThreadID 17
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 524
ThreadID 10
The value of the produced item is: 355773073
The number of items currently in the buffer is 1

The sleeping time is 888
ThreadID 11
The value of the consumed item is: 355773073
The number of items currently in the buffer is 0

The sleeping time is 145
ThreadID 16
The value of the produced item is: 676023144
The number of items currently in the buffer is 1

The sleeping time is 13
ThreadID 16
The value of the produced item is: 314907970
The number of items currently in the buffer is 2

The sleeping time is 128
ThreadID 10
The value of the produced item is: 1852785470
The number of items currently in the buffer is 3

The sleeping time is 710
ThreadID 12
The value of the produced item is: 1069570067
The number of items currently in the buffer is 4

The sleeping time is 140
ThreadID 16
The value of the produced item is: 1299637845
The number of items currently in the buffer is 5

The sleeping time is 775
ThreadID 12
The value of the produced item is: 1832982246
The number of items currently in the buffer is 6

The sleeping time is 796
ThreadID 18
The value of the produced item is: 624551537
The number of items currently in the buffer is 7

The sleeping time is 918
ThreadID 19
The value of the consumed item is: 676023144
The number of items currently in the buffer is 6

The sleeping time is 37
ThreadID 19
The value of the consumed item is: 314907970
The number of items currently in the buffer is 5

The sleeping time is 587
ThreadID 15
The value of the consumed item is: 1852785470
The number of items currently in the buffer is 4

The sleeping time is 420
ThreadID 13
The value of the consumed item is: 1069570067
The number of items currently in the buffer is 3

The sleeping time is 287
ThreadID 18
The value of the produced item is: 28355131
The number of items currently in the buffer is 4

The sleeping time is 591
ThreadID 17
The value of the consumed item is: 1299637845
The number of items currently in the buffer is 3

The sleeping time is 457
ThreadID 15
The value of the consumed item is: 1832982246
The number of items currently in the buffer is 2

The sleeping time is 535
ThreadID 10
The value of the produced item is: 1265958250
The number of items currently in the buffer is 3

The sleeping time is 45
ThreadID 10
The value of the produced item is: 955613511
The number of items currently in the buffer is 4

The sleeping time is 570
ThreadID 11
The value of the consumed item is: 624551537
The number of items currently in the buffer is 3

The sleeping time is 378
ThreadID 19
The value of the consumed item is: 28355131
The number of items currently in the buffer is 2

The sleeping time is 830
ThreadID 16
The value of the produced item is: 1107662296
The number of items currently in the buffer is 3

The sleeping time is 573
ThreadID 13
The value of the consumed item is: 1265958250
The number of items currently in the buffer is 2

The sleeping time is 66
ThreadID 12
The value of the produced item is: 2135030701
The number of items currently in the buffer is 3

The sleeping time is 561
ThreadID 16
The value of the produced item is: 2007962715
The number of items currently in the buffer is 4

The sleeping time is 858
ThreadID 18
The value of the produced item is: 983325915
The number of items currently in the buffer is 5

The sleeping time is 1
ThreadID 18
The value of the produced item is: 1243556740
The number of items currently in the buffer is 6

The sleeping time is 272
ThreadID 17
The value of the consumed item is: 955613511
The number of items currently in the buffer is 5

The sleeping time is 836
ThreadID 11
The value of the consumed item is: 1107662296
The number of items currently in the buffer is 4

The sleeping time is 177
ThreadID 13
The value of the consumed item is: 2135030701
The number of items currently in the buffer is 3

The sleeping time is 745
ThreadID 15
The value of the consumed item is: 2007962715
The number of items currently in the buffer is 2

The sleeping time is 248
ThreadID 11
The value of the consumed item is: 983325915
The number of items currently in the buffer is 1

The sleeping time is 649
ThreadID 19
The value of the consumed item is: 1243556740
The number of items currently in the buffer is 0

The sleeping time is 698
ThreadID 12
The value of the produced item is: 1236032260
The number of items currently in the buffer is 1

The sleeping time is 120
ThreadID 15
The value of the consumed item is: 1236032260
The number of items currently in the buffer is 0

The sleeping time is 103
ThreadID 19
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 31
ThreadID 19
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 605
ThreadID 10
The value of the produced item is: 1972585572
The number of items currently in the buffer is 1

The sleeping time is 464
ThreadID 15
The value of the consumed item is: 1972585572
The number of items currently in the buffer is 0

The sleeping time is 275
ThreadID 18
The value of the produced item is: 6841269
The number of items currently in the buffer is 1

The sleeping time is 124
ThreadID 15
The value of the consumed item is: 6841269
The number of items currently in the buffer is 0

The sleeping time is 399
ThreadID 16
The value of the produced item is: 2119673263
The number of items currently in the buffer is 1

The sleeping time is 79
ThreadID 15
The value of the consumed item is: 2119673263
The number of items currently in the buffer is 0

The sleeping time is 780
ThreadID 10
The value of the produced item is: 478433303
The number of items currently in the buffer is 1

The sleeping time is 65
ThreadID 17
The value of the consumed item is: 478433303
The number of items currently in the buffer is 0

The sleeping time is 45
ThreadID 15
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 252
ThreadID 17
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 366
ThreadID 13
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 625
ThreadID 11
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 33
ThreadID 11
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 838
ThreadID 19
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 11
ThreadID 19
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 686
ThreadID 12
The value of the produced item is: 586785675
The number of items currently in the buffer is 1

The sleeping time is 782
ThreadID 18
The value of the produced item is: 94692032
The number of items currently in the buffer is 2

The sleeping time is 946
ThreadID 15
The value of the consumed item is: 586785675
The number of items currently in the buffer is 1

The sleeping time is 607
ThreadID 17
The value of the consumed item is: 94692032
The number of items currently in the buffer is 0

The sleeping time is 241
ThreadID 17
No value in the buffer right now
The number of items currently in the buffer is 0

The sleeping time is 550
ThreadID 10
The value of the produced item is: 772850171
The number of items currently in the buffer is 1

The sleeping time is 555
ThreadID 13
The value of the consumed item is: 772850171
The number of items currently in the buffer is 0

The sleeping time is 448
ThreadID 16
The value of the produced item is: 603392309
The number of items currently in the buffer is 1

The sleeping time is 4
ThreadID 16
The value of the produced item is: 949441507
The number of items currently in the buffer is 2

The sleeping time is 379
ThreadID 18
The value of the produced item is: 947878656
The number of items currently in the buffer is 3

The sleeping time is 790
ThreadID 15
The value of the consumed item is: 603392309
The number of items currently in the buffer is 2

The sleeping time is 832
ThreadID 11
The value of the consumed item is: 949441507
The number of items currently in the buffer is 1

The sleeping time is 411
ThreadID 12
The value of the produced item is: 1888075959
The number of items currently in the buffer is 2

The sleeping time is 480
ThreadID 16
The value of the produced item is: 887550058
The number of items currently in the buffer is 3

The sleeping time is 766
ThreadID 19
The value of the consumed item is: 947878656
The number of items currently in the buffer is 2

The sleeping time is 909
ThreadID 10
The value of the produced item is: 1670134468
The number of items currently in the buffer is 3

The sleeping time is 294
ThreadID 18
The value of the produced item is: 911264470
The number of items currently in the buffer is 4

The sleeping time is 720
ThreadID 17
The value of the consumed item is: 1888075959
The number of items currently in the buffer is 3

The sleeping time is 571
ThreadID 10
The value of the produced item is: 759779355
The number of items currently in the buffer is 4

The sleeping time is 356
ThreadID 13
The value of the consumed item is: 887550058
The number of items currently in the buffer is 3

The sleeping time is 912
ThreadID 12
The value of the produced item is: 462268602
The number of items currently in the buffer is 4

The sleeping time is 780
ThreadID 17
The value of the consumed item is: 1670134468
The number of items currently in the buffer is 3

The sleeping time is 580
ThreadID 15
The value of the consumed item is: 911264470
The number of items currently in the buffer is 2

The sleeping time is 229
ThreadID 12
The value of the produced item is: 1371037717
The number of items currently in the buffer is 3

The sleeping time is 260
ThreadID 11
The value of the consumed item is: 759779355
The number of items currently in the buffer is 2

The sleeping time is 210
ThreadID 18
The value of the produced item is: 1750662970
The number of items currently in the buffer is 3

The sleeping time is 761
ThreadID 19
The value of the consumed item is: 462268602
The number of items currently in the buffer is 2

The sleeping time is 981
ThreadID 12
The value of the produced item is: 992059272
The number of items currently in the buffer is 3

The sleeping time is 735
ThreadID 15
The value of the consumed item is: 1371037717
The number of items currently in the buffer is 2

The sleeping time is 92
ThreadID 16
The value of the produced item is: 887649123
The number of items currently in the buffer is 3

The sleeping time is 277
ThreadID 12
The value of the produced item is: 1394996613
The number of items currently in the buffer is 4

The sleeping time is 796
ThreadID 17
The value of the consumed item is: 1750662970
The number of items currently in the buffer is 3

The sleeping time is 446
ThreadID 13
The value of the consumed item is: 992059272
The number of items currently in the buffer is 2

The sleeping time is 479
ThreadID 16
The value of the produced item is: 344280321
The number of items currently in the buffer is 3

The sleeping time is 929
ThreadID 10
The value of the produced item is: 1877711562
The number of items currently in the buffer is 4

