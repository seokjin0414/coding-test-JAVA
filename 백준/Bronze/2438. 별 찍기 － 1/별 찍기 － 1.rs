use std::io;
use std::fmt::Write;
use std::error::Error;

fn main () -> Result<(), Box<dyn Error>> {
    let mut n = String::new();
    io::stdin().read_line(&mut n)?;
    let n = n.split_ascii_whitespace().next().unwrap().parse::<usize>().unwrap();
    let mut r = String::new();
    
    for i in 1..=n {
        writeln!(r, "{}", "*".repeat(i))?;
    }
    
    println!("{r}");
    Ok(())
}