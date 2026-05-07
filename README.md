# Final Project - Mobile Automation Testing Todo App
---
## Tools
- Katalon Studio
- Android Device

## Application
Todo_2.0_APKPure

### Package:
com.avinashproduct.todo

## Tujuan 
Tujuan testing ini adalah untuk memastikan fitur utama pada aplikasi Todo berjalan dengan baik, seperti membuat task, menghapus task dan validasi input.

## Struktur Project
Project dibuat menggunakan konsep modular test case agar lebih rapi dan mudah digunakan ulang.
### Blocks/
- OpenApp
- AddTask
- DeleteTask
- Validation Task

### Scenario/
- TC001-Create Task
- TC002-Delete Task
- TC003-Validation Empty

## Teknik Testing yang Digunakan
Project ini menggunakan beberapa teknik automation berikut:
- Data Driven Testing: Digunakan pada test case Create Task dengan 3 data berbeda.
- If Else Statement: Digunakan saat memilih bulan pada Date Picker. Jika nilai bulan lebih dari 0 maka sistem akan klik tombol Next Month sesuai jumlah data.
- Loop Statement: Digunakan untuk mengulang klik tombol Next Month sesuai jumlah bulan.
- Switch Case: Digunakan pada Pemilihan AM / PM dan Pemilihan Category Task

## Test Case
### TC001 - Create Task
#### Tujuan:
Memastikan user dapat menambahkan task baru dengan data valid.
#### Langkah Testing:
1. Buka aplikasi Todo
2. Klik tombol Add Task
3. Input Task Title
4. Input Description
5. Set Date
6. Set Time
7. Pilih Category
8. Klik Save
#### Expected Result:
Task berhasil tersimpan dan tampil pada list task.
#### Actual Result:
Sesuai expected result.

### TC002 - Delete Task
#### Tujuan:
Memastikan user dapat menghapus task yang sudah dibuat.
#### Langkah Testing:
1. Buka aplikasi
2. Pilih menu titik tiga pada task
3. Klik Delete
#### Expected Result:
Task terhapus dari daftar.
#### Actual Result:
Sesuai expected result.

### TC003 - Validation Empty Title
#### Tujuan:
Memastikan sistem menolak pembuatan task tanpa judul.
#### Langkah Testing:
1. Klik Add Task
2. Kosongkan field Task Title
3. Isi data lain jika diperlukan
4. Klik Save
#### Expected Result:
Task gagal dibuat / muncul validasi.
#### Actual Result:
Sesuai expected result.

## Test Suite
Test suite dibuat untuk menjalankan seluruh test case sekaligus dengan tambahan Data Driven Testing: 
### Berisi:
- TC001 - Create Task
- TC002 - Delete Task
- TC003 - Validation Empty

## Cara Menjalankan Project
1. Buka aplikasi Katalon Studio
2. Import project ke dalam Katalon Studio
3. Hubungkan Android device / nyalakan emulator
4. Jalankan Test Suite

## Kesimpulan
Automation testing pada aplikasi Todo berhasil dijalankan menggunakan Katalon Studio pada Android real device.
### Semua skenario utama berhasil diuji dengan baik, yaitu:
- Menambahkan task
- Menghapus task
- Validasi input kosong

### Project ini juga berhasil menerapkan:
- Data Driven Testing
- If Else Statement
- Loop Statement
- Switch Case

# Author
Putri Khulfiani
