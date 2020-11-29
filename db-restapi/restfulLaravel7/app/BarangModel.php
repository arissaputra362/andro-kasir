<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class BarangModel extends Model
{
    //nama tabel
    protected $table = 'stuff';

    //nama primary key
    protected $primaryKey = 'kode_barang';
}
