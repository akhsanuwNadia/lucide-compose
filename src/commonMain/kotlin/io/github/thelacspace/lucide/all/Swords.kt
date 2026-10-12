package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Swords") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0f,19.0f)
                lineTo(19.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.5f,17.5f)
                lineTo(3.586f,6.586f)
                curveTo(3.2109013f,6.2110143f,3.0001132f,5.7023897f,3.0f,5.172f)
                lineTo(3.0f,3.0f)
                lineTo(5.172f,3.0f)
                curveTo(5.7023897f,3.0001132f,6.2110143f,3.2109013f,6.586f,3.586f)
                lineTo(17.5f,14.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.828f,6.172f)
                lineTo(17.414f,3.586f)
                curveTo(17.788984f,3.2109013f,18.29761f,3.0001135f,18.828f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,5.172f)
                curveTo(20.999887f,5.7023897f,20.789099f,6.2110147f,20.414f,6.586f)
                lineTo(17.828f,9.172f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,16.0f)
                lineTo(20.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,21.0f)
                lineTo(21.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,14.0f)
                lineTo(9.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,21.0f)
                lineTo(3.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5f,16.5f)
                lineTo(4.0f,20.0f)
            }
}

public val LucideIcons.All.SwordsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Swords: ImageVector
    @Composable get() = SwordsDefinition.asImageVector()
