package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleParkingOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.656f,7.0f)
                lineTo(13.0f,7.0f)
                curveTo(13.84903f,7.000071f,14.658271f,7.359894f,15.227052f,7.990242f)
                curveTo(15.795833f,8.62059f,16.070885f,9.462428f,15.984f,10.307f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,13.0f)
                lineTo(9.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.071f,19.071f)
                curveTo(15.161004f,22.946177f,8.854175f,22.932076f,4.9615493f,19.03945f)
                curveTo(1.0689241f,15.146824f,1.0548216f,8.839994f,4.93f,4.93f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.357f,2.687f)
                curveTo(12.056664f,1.2396227f,16.26224f,2.119502f,19.07137f,4.9286313f)
                curveTo(21.880499f,7.7377605f,22.760378f,11.9433365f,21.313f,15.643001f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,17.0f)
                lineTo(9.0f,9.0f)
            }
}

public val LucideIcons.All.CircleParkingOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleParkingOff: ImageVector
    @Composable get() = CircleParkingOffDefinition.asImageVector()
