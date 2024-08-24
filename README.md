# CropView
 Cropview Library

This library is still unstable. It will be improved through updates


Example
	
 
 	var isCropRequested by remember { mutableStateOf(false) }
	com.choidev.cropview.CropView(
	   key = "",
				imageBitmap = it,
				cropStrokeColor = Color.Black,
				cropStrokeWidth = 4.dp,
				onCrop = { bitmap , complete, key ->
								croppedBitmap = bitmap
								isCropRequested = complete
								cropActive = false
				},
				onRequestCrop = isCropRequested,
	)
                 Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color.Black)
                        .fillMaxWidth()
                        .padding(12.dp)
                        .height(30.dp)
                        .clickable {
                            isCropRequested = true
                        },
                    contentAlignment = Alignment.Center,
                ){
                    Text(text = "Crop", style = TextStyle(color = Color.White))
                }
		

  - Add
  ```
	implementation ("com.github.supremehyo:Compose-CropView:v1.0.5")
  ```

- Forward the image you want to crop to the ImageBitMap.

- The onRequestCrop should have a boolean data type, and if you press the crop button from the outside and deliver the true value when requested, the crop proceeds from the inside.

- When the crop is complete, the value to change the bitmap resulting from onCrop and the boolean delivered from onRequestCrop to false is sent to false. If not, you do not need to use this false value.

- The key is used to track which images have been cropped. If you are managing multiple images, you can use the key to track and manage the cropped images separately. It is optional, so you don't have to use it.

![image](https://github.com/user-attachments/assets/a201d3a7-f984-4195-9976-2b746c1aadd9)
