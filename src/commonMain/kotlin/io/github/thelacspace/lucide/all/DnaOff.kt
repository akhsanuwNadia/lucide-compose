package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DnaOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,2.0f)
                curveTo(13.65f,3.5f,12.908f,5.0f,12.5f,6.5f)
                lineTo(14.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,6.0f)
                lineTo(14.109f,3.109f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,15.0f)
                curveTo(5.333f,12.0f,8.667f,12.0f,12.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,9.0f)
                lineTo(20.891f,9.891f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,9.0f)
                curveTo(20.5f,10.35f,19.0f,11.092f,17.5f,11.5f)
                lineTo(16.5f,10.5f)
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
                curveTo(10.35f,20.5f,11.092f,19.0f,11.5f,17.5f)
                lineTo(10.0f,16.0f)
            }
}

public val LucideIcons.All.DnaOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DnaOff: ImageVector
    @Composable get() = DnaOffDefinition.asImageVector()
