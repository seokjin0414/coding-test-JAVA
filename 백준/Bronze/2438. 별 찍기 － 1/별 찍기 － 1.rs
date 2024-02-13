use std::fmt::Write;

fn main() {
    let mut bf: String = String::new();
    let mut r: String = String::new();

    bf.clear();
    std::io::stdin().read_line(&mut bf).unwrap();
    let n: usize = bf.trim_end().parse().unwrap();

    for i in 0..n {
        writeln!(&mut r, "{}", "*".repeat(i + 1)).unwrap();
    }

    print!("{}", r);
}