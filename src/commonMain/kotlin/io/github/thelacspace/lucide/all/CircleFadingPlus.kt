package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleFadingPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                curveTo(15.964218f,1.999277f,19.5546f,4.340327f,21.15296f,7.9680367f)
                curveTo(22.751318f,11.595746f,22.05585f,15.8251295f,19.380001f,18.75f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,8.0f)
                lineTo(12.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,12.0f)
                lineTo(8.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.5f,8.875f)
                curveTo(2.1813498f,9.8436575f,2.0127332f,10.855356f,2.0f,11.875f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.83f,16.0f)
                curveTo(3.3915012f,17.291828f,4.2195816f,18.450459f,5.26f,19.4f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.636f,5.235f)
                curveTo(4.915041f,4.931231f,5.2126093f,4.6450176f,5.527f,4.3780003f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.644f,21.42f)
                curveTo(11.137696f,22.308369f,13.881897f,22.171717f,16.275f,21.04f)
            }
}

public val LucideIcons.All.CircleFadingPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleFadingPlus: ImageVector
    @Composable get() = CircleFadingPlusDefinition.asImageVector()
