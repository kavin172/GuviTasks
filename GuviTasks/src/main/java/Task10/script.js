let screen = document.getElementById('screen');

// Initialize memory
if (localStorage.getItem('memory') === null) {
  localStorage.setItem('memory', '0');
}

// Insert value into screen
function insert(value) {
  if (screen.value === '0') {
    screen.value = value;
  } else {
    screen.value += value;
  }
}

// Clear screen
function clearScreen() {
  screen.value = '0';
}

// Delete last character
function deleteLast() {
  screen.value = screen.value.slice(0, -1);
  if (screen.value === '') screen.value = '0';
}

// Calculate result
function calculate() {
  try {
    screen.value = eval(screen.value);
  } catch {
    alert('Invalid Expression');
    clearScreen();
  }
}

// Add to memory
function memoryAdd() {
  let memory = parseFloat(localStorage.getItem('memory')) || 0;
  memory += parseFloat(screen.value);
  localStorage.setItem('memory', memory.toString());
  alert(`Added to memory: ${screen.value}`);
}

// Subtract from memory
function memorySubtract() {
  let memory = parseFloat(localStorage.getItem('memory')) || 0;
  memory -= parseFloat(screen.value);
  localStorage.setItem('memory', memory.toString());
  alert(`Subtracted from memory: ${screen.value}`);
}

// Clear memory
function memoryClear() {
  localStorage.setItem('memory', '0');
  alert('Memory cleared');
}

// Restrict input to numbers using key events
document.addEventListener('keydown', (event) => {
  const key = event.key;
  if (!/[0-9+\-*/.=]/.test(key)) {
    event.preventDefault();
    alert('Only numbers are allowed');
  }
});
