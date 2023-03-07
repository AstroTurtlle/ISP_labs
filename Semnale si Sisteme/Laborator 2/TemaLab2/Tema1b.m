t = -15:0.1:15;
interval1 = (t>=0)&(t<=4);
interval2 = (t<0)&(t>=-4);
x1 = @(t)((-t + 2).*interval1 + (-t-2).*interval2);
subplot(2,2,1);
plot(t, x1(t-1));
xlabel('t');ylabel('x_1(t-1)'); title('Semnal x_1(t-1)');

subplot(2,2,2);
plot(t, x1(t+1));
xlabel('t');ylabel('x_1(t+1)'); title('Semnal x_1(t+1)');

subplot(2,2,3);
plot(t, x1(2*t));
xlabel('t');ylabel('x_1(2t)'); title('Semnal x_1(2t)');

subplot(2,2,4);
plot(t, x1(t/2));
xlabel('t');ylabel('x_1(t/2)'); title('Semnal x_1(t/2)');
