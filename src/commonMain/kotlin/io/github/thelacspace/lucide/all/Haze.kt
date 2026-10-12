package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Haze") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.199999809265137,6.199999809265137)
                lineTo(6.599999904632568,7.599999904632568)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,13.0)
                lineTo(4.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,13.0)
                lineTo(22.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.399999618530273,7.599999904632568)
                lineTo(18.799999237060547,6.199999809265137)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,17.0)
                lineTo(2.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,21.0)
                lineTo(2.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,13.0)
                curveTo(15.990151405334473,10.797843933105469,14.202178001403809,9.01784896850586,12.0,9.01784896850586)
                curveTo(9.797821998596191,9.01784896850586,8.009848594665527,10.797843933105469,8.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,5.0)
                lineTo(12.0,2.5)
            }
}

public val LucideIcons.All.HazeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Haze: ImageVector
    @Composable get() = HazeDefinition.asImageVector()
