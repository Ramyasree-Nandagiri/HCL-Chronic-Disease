import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

loginForm: FormGroup;
email: string = '';
password: string = '';

constructor(private fb: FormBuilder) {
  // Initialize form with validation
  this.loginForm = this.fb.group({
    email: ['', [Validators.required, Validators.minLength(3)]],
    password: ['', [Validators.required, Validators.minLength(6)]]
  });
}

onSubmit() {
  if (this.loginForm.valid) {
    console.log('Form Submitted!', this.loginForm.value);
    alert('Login successful!');
  } else {
    alert('Please enter valid details!');
  }
}

}
