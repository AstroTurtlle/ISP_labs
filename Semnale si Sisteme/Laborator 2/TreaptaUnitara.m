t1 = -2; t2 = 6; tstep = 0.001;
t = t1:tstep:t2;
x = (t>=0);
figure;
plot(t, x)
xlabel('t'); ylabel('u(t)'); title('Semnal treapta unitara');
axis([t1, t2, -0.1, 1.1])

x = @(t) (t>=0);
t1 = -2; t2 = 6;
t = [t1,t2];
figure;
fplot(x, t)
xlabel('t'); ylabel('u(t)');
axis([t -0.1 1.1])
title('Semnal treapta unitara fplot');