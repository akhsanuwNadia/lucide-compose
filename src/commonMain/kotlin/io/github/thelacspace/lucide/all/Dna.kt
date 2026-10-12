package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Dna") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,16.0f)
                lineTo(11.5f,17.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,8.0f)
                lineTo(12.5f,6.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,2.0f)
                curveTo(13.202f,3.9980001f,12.482f,5.995f,12.193f,7.993f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5f,10.5f)
                lineTo(17.5f,11.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,6.0f)
                lineTo(14.109f,3.109f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,15.0f)
                curveTo(8.667f,9.0f,15.333f,15.0f,22.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,9.0f)
                lineTo(20.891f,9.891f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.109f,14.109f)
                lineTo(4.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.5f,12.5f)
                lineTo(7.5f,13.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,18.0f)
                lineTo(9.891f,20.891f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,22.0f)
                curveTo(10.798f,20.002f,11.518f,18.005001f,11.807f,16.007f)
            }
}

public val LucideIcons.All.DnaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Dna: ImageVector
    @Composable get() = DnaDefinition.asImageVector()
