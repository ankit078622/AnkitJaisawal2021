import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-viewproduct',
  templateUrl: './viewproduct.component.html',
  styleUrls: ['./viewproduct.component.css']
})
export class ViewproductComponent implements OnInit {

  public products: Product[];
  public pro: any;
  

  constructor(private productservice:ProductService){}
  
 ngOnInit(){
   this.getProduct();
 }

  public getProduct(): void{
    this.productservice.getProducts().subscribe(
      (response: Product[]) => {
        this.products=response;
      //(products) => {
      //  this.products=response;
      //  for(let i=0;i<response.length;i++){

      //     this.products[i]=response[i];
      //     console.log(JSON.stringify(this.products[i].product_category));//for checking the in inspect
      //  }

       console.log(response.length);
          // this.products[]=response;
          // console.log(JSON.stringify(this.products[0].product_id));//for checking the in inspect
           
  
      },
      (error: HttpErrorResponse)=>{
        alert(error.message);
        
      }
      
    );
  }

  public searchProducts(key: string): void {
    console.log(key);
    const results: Product[] = [];
    for (const product of this.products) {
      if (product.product_category.toLowerCase().indexOf(key.toLowerCase()) !== -1
      || product.product_description.toLowerCase().indexOf(key.toLowerCase()) !== -1
      || product.product_manufacturer.toLowerCase().indexOf(key.toLowerCase()) !== -1
      || product.product_name.toLowerCase().indexOf(key.toLowerCase()) !== -1
      || product.product_price.toLowerCase().indexOf(key.toLowerCase()) !== -1
      || product.product_unit.toLowerCase().indexOf(key.toLowerCase()) !== -1) {
        results.push(product);
      }
    }
    this.products = results;
    if (results.length === 0 || !key) {
      this.getProduct();
    }
  }
  

}
