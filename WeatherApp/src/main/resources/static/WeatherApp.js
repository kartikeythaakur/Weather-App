document.addEventListener('DOMContentLoaded', () => {
  const searchboxy = document.getElementById('searchboxy');
  const searchbutton = document.getElementById('searchbutton');
  const city = document.getElementById('cities');
  const weatherimage = document.getElementById('weatherimage');
  const weatherval = document.getElementById('weatherval');
  const tempvalue = document.getElementById('tempvalue');
  const windval = document.getElementById('windvalue');
  const humidval = document.getElementById('humidval');

  searchbutton.addEventListener('click', async (e) => {
    e.preventDefault();
    const location = searchboxy.value.trim();
    if (!location) {
      alert("Please enter a location");
      return;
    }

    try {
      const response = await fetch(`http://localhost:8080/weather?location=${location}`);
      if (!response.ok) {
        throw new Error("Error while fetching location");
      }

      const data = await response.json();
      
      // Ensure the response data matches this structure
      city.textContent = `${data.location.name}, ${data.location.region}, ${data.location.country}`;
      weatherimage.src = data.current.weather_icons[0]; // Weather icon from API
      weatherval.textContent = data.current.weather_descriptions[0]; // Weather description (e.g., sunny)
      tempvalue.textContent = `${data.current.temperature}°C`; // Temperature value
      windval.textContent = `${data.current.wind_speed} km/h`; // Wind speed value
      humidval.textContent = `${data.current.humidity}%`; // Humidity percentage
    } catch (error) {
      alert(error.message);
    }
  });
});



// const searchboxy = document.getElementById('searchboxy');
// const searchbutton = document.getElementById('searchbutton');
// const city = document.getElementById('cities');
// const weatherimage = document.getElementById('weatherimage');
// const weatherval = document.getElementById('weatherval');
// const tempvalue = document.getElementById('tempvalue');
// const windval = document.getElementById('windval');
// const humidval = document.getElementById('humidval');

// searchbutton.addEventListener('click', async (e) => {
//     e.preventDefault();

//     // Get the input location 
//     const location = searchboxy.value.trim();

//     // Validate input
//     if (!location) {
//         alert("Please enter a location");
//         return; // Exit the function if input is invalid
//     }

//     try {
//         // Call the backend API
//         const response = await fetch(`http://localhost:8080/weather?location=${location}`);

//         if (!response.ok) {
//             throw new Error("Error while fetching location");
//         }

//         // Parse the response JSON
//         const data = await response.json();

//         // Extract and display data
//         city.textContent = `${data.location.name}, ${data.location.region}, ${data.location.country}`;
//         weatherimage.src = data.current.weather_icons[0]; // Weather icon
//         weatherval.textContent = data.current.weather_descriptions[0]; // Weather description (e.g., sunny)
//         tempvalue.textContent = `${data.current.temperature}°C`; // Temperature
//         windval.textContent = `${data.current.wind_speed} km/h`; // Wind speed
//         humidval.textContent = `${data.current.humidity}%`; // Humidity
//     } catch (error) {
//         // Handle errors
//         alert(error.message);
//         console.error("Error:", error);
//     }
// });
