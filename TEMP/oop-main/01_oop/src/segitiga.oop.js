class Segitiga {
    constructor(alas, tinggi) {
      this.alas = alas;
      this.tinggi = tinggi;
    }
  
    hitungLuas() {
      return 0.5 * this.alas * this.tinggi;
    }
  }
  
  const segitiga1 = new Segitiga(10, 5);
  const luasSegitiga1 = segitiga1.hitungLuas();
  console.log(luasSegitiga1); // Output: 25
  
  const segitiga2 = new Segitiga(6, 4);
  const luasSegitiga2 = segitiga2.hitungLuas();
  console.log(luasSegitiga2); // Output: 12