package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HeadphoneOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0f,14.0f)
                lineTo(19.657f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.128f,3.47f)
                curveTo(11.874403f,2.5452435f,14.898074f,2.9995074f,17.251507f,4.6904426f)
                curveTo(19.604939f,6.381377f,21.000175f,9.102086f,21.0f,12.0f)
                lineTo(21.0f,15.343f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.414f,20.414f)
                curveTo(20.039015f,20.789099f,19.53039f,20.999886f,19.0f,21.0f)
                lineTo(18.0f,21.0f)
                curveTo(16.89543f,21.0f,16.0f,20.10457f,16.0f,19.0f)
                lineTo(16.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,14.0f)
                lineTo(6.0f,14.0f)
                curveTo(7.1045694f,14.0f,8.0f,14.895431f,8.0f,16.0f)
                lineTo(8.0f,19.0f)
                curveTo(8.0f,20.10457f,7.1045694f,21.0f,6.0f,21.0f)
                lineTo(5.0f,21.0f)
                curveTo(3.8954306f,21.0f,3.0f,20.10457f,3.0f,19.0f)
                lineTo(3.0f,12.0f)
                curveTo(2.9999793f,9.613044f,3.948177f,7.3238435f,5.6359997f,5.636f)
            }
}

public val LucideIcons.All.HeadphoneOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HeadphoneOff: ImageVector
    @Composable get() = HeadphoneOffDefinition.asImageVector()
