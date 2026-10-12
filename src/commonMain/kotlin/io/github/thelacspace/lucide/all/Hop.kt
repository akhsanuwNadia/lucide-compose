package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Hop") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.82f,16.12f)
                curveTo(12.51f,16.720001f,14.73f,16.910002f,16.0f,16.970001f)
                curveTo(16.55f,17.000002f,17.0f,16.550001f,16.97f,16.000002f)
                curveTo(16.91f,14.730001f,16.71f,12.500002f,16.119999f,10.820002f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.5f,6.5f)
                curveTo(13.14f,6.5f,16.5f,6.12f,18.21f,5.43f)
                curveTo(18.73f,5.23f,18.759998f,4.6099997f,18.33f,4.2599998f)
                curveTo(14.353391f,1.0155414f,8.566261f,1.3081726f,4.937217f,4.937217f)
                curveTo(1.3081727f,8.566261f,1.0155418f,14.353391f,4.26f,18.33f)
                curveTo(4.61f,18.76f,5.2200003f,18.73f,5.4300003f,18.21f)
                curveTo(6.1200004f,16.5f,6.5000005f,13.139999f,6.5000005f,11.499999f)
                curveTo(7.8400006f,11.949999f,9.6f,12.399999f,11.380001f,12.119999f)
                curveTo(11.758585f,12.058752f,12.05391f,11.759381f,12.110001f,11.379999f)
                curveTo(12.410001f,9.239999f,11.960001f,7.879999f,11.500001f,6.499999f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.62f,16.95f)
                curveTo(15.82f,17.800001f,16.24f,19.710001f,16.119999f,21.230001f)
                curveTo(16.103487f,21.44649f,15.9963455f,21.645945f,15.824964f,21.779242f)
                curveTo(15.653583f,21.912539f,15.43389f,21.967287f,15.219999f,21.930002f)
                curveTo(13.806895f,21.655067f,12.435444f,21.197916f,11.139999f,20.570002f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.13f,21.05f)
                curveTo(17.779999f,21.679998f,19.81f,21.89f,21.0f,21.96f)
                curveTo(21.259703f,21.977976f,21.514467f,21.88262f,21.698544f,21.698544f)
                curveTo(21.88262f,21.514467f,21.977976f,21.259703f,21.96f,21.0f)
                curveTo(21.889973f,19.342482f,21.587002f,17.703068f,21.06f,16.130001f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.94f,15.62f)
                curveTo(17.800001f,15.82f,19.710001f,16.24f,21.23f,16.119999f)
                curveTo(21.446487f,16.103487f,21.645943f,15.9963455f,21.77924f,15.824964f)
                curveTo(21.912537f,15.653583f,21.967285f,15.43389f,21.93f,15.219999f)
                curveTo(21.655066f,13.806895f,21.197914f,12.435444f,20.57f,11.139999f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.99f,5.52f)
                curveTo(19.234133f,6.874298f,20.293348f,8.387465f,21.14f,10.02f)
                curveTo(21.249191f,10.259866f,21.233238f,10.538122f,21.09735f,10.763937f)
                curveTo(20.96146f,10.989752f,20.723072f,11.134151f,20.46f,11.150001f)
                curveTo(18.13f,11.35f,15.159999f,10.830001f,12.189999f,9.580001f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.93f,4.93f)
                lineTo(3.0f,3.0f)
                curveTo(2.8656228f,2.8683376f,2.789898f,2.6881282f,2.789898f,2.5f)
                curveTo(2.789898f,2.3118718f,2.8656228f,2.1316624f,3.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.58f,12.18f)
                curveTo(10.82f,15.16f,11.35f,18.130001f,11.15f,20.46f)
                curveTo(11.1341505f,20.723072f,10.989751f,20.96146f,10.763936f,21.09735f)
                curveTo(10.538121f,21.233238f,10.259865f,21.249191f,10.0199995f,21.14f)
                curveTo(8.387464f,20.293348f,6.8742976f,19.234133f,5.5199995f,17.99f)
            }
}

public val LucideIcons.All.HopDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Hop: ImageVector
    @Composable get() = HopDefinition.asImageVector()
