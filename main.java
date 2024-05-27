const igboBtn = document.getElementById('igbo-btn');
const hausaBtn = document.getElementById('hausa-btn');
const contentSection = document.getElementById('content');
const vocabList = document.getElementById('vocab-list');
const phraseList = document.getElementById('phrase-list');
const quizContainer = document.getElementById('quiz-container');

// Sample data (replace with your actual data)
const igboVocabulary = [
  { word: "Ndewo", translation: "Hello" },
  { word: "Daalụ", translation: "Thank you" }
];

const hausaVocabulary = [
  { word: "Sannu", translation: "Hello" },
  { word: "Na gode", translation: "Thank you" }
];

const igboQuizzes = [
  {
    question: "What is the Igbo word for 'Hello'?",
    options: ["Ndewo", "Salaam", "Bonjour"],
    answer: "Ndewo"
  },
  {
    question: "How do you say 'Thank you' in Igbo?",
    options: ["Daalụ", "Merci", "Arigato"],
    answer: "Daalụ"
  }
];

function showQuiz(quizData) {
  quizContainer.innerHTML = ""; // Clear previous content

  const quizTitle = document.createElement('h3');
  quizTitle.innerText = "Igbo Quiz"; // Change for Hausa quiz
  quizContainer.appendChild(quizTitle);

  const questionList = document.createElement('ul');
  quizData.forEach(question => {
    const questionItem = document.createElement('li');
    questionItem.innerText = question.question;
    questionList.appendChild(questionItem);

    const optionsList = document.createElement('ul');
    question.options.forEach(option => {
      const optionItem = document.createElement('li');
      optionItem.innerText = option;
      optionItem.addEventListener('click', function() {
        checkAnswer(option.innerText, question.answer);
      });
      optionsList.appendChild(optionItem);
    });
    questionItem.appendChild(optionsList);
  });
  quizContainer.appendChild(questionList);

  const submitButton = document.createElement('button');
  submitButton.innerText = "Submit Answers";
  submitButton.addEventListener('click', function() {
    // Handle submit logic (check answers, display feedback)
  });
  quizContainer.appendChild(submitButton);
}

function checkAnswer(userAnswer, correctAnswer) {
  // Implement logic to check answer and display feedback (e.g., alert)
  console.log("User answer:", userAnswer, "Correct answer:", correctAnswer);
}

igboBtn.addEventListener('click', function() {
  contentSection.classList.add('hidden'); // Hide greetings
  vocabList.innerHTML = ""; // Clear previous content (if any)
  showQuiz(igboQuizzes); // Display Igbo quiz
});

hausaBtn.addEventListener('click', function() {
  // Add similar logic to handle Hausa content and quizzes (replace with your Hausa quiz data)
});
