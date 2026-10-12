package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareDashedText") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,21.0f)
                lineTo(15.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,3.0f)
                lineTo(15.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,3.0f)
                curveTo(20.10457f,3.0f,21.0f,3.8954306f,21.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,14.0f)
                lineTo(21.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,19.0f)
                curveTo(21.0f,20.10457f,20.10457f,21.0f,19.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,9.0f)
                lineTo(21.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,14.0f)
                lineTo(3.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,9.0f)
                lineTo(3.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,21.0f)
                curveTo(3.8954306f,21.0f,3.0f,20.10457f,3.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,3.0f)
                curveTo(3.8954306f,3.0f,3.0f,3.8954306f,3.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,12.0f)
                lineTo(17.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,16.0f)
                lineTo(13.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,8.0f)
                lineTo(15.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,21.0f)
                lineTo(10.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,3.0f)
                lineTo(10.0f,3.0f)
            }
}

public val LucideIcons.All.SquareDashedTextDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareDashedText: ImageVector
    @Composable get() = SquareDashedTextDefinition.asImageVector()
