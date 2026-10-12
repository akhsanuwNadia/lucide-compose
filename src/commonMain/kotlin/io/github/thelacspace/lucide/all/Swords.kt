package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Swords") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0,19.0)
                lineTo(19.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.5,17.5)
                lineTo(3.5859999656677246,6.585999965667725)
                curveTo(3.2109012603759766,6.211014270782471,3.0001132488250732,5.702389717102051,3.0,5.171999931335449)
                lineTo(3.0,3.0)
                lineTo(5.171999931335449,3.0)
                curveTo(5.702389717102051,3.0001132488250732,6.211014270782471,3.2109012603759766,6.585999965667725,3.5859999656677246)
                lineTo(17.5,14.5)
            }
            lucidePath(strokeWidth) {
                moveTo(14.82800006866455,6.171999931335449)
                lineTo(17.413999557495117,3.5859999656677246)
                curveTo(17.788984298706055,3.2109012603759766,18.297609329223633,3.0001134872436523,18.827999114990234,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,5.171999931335449)
                curveTo(20.999887466430664,5.702389717102051,20.789098739624023,6.211014747619629,20.413999557495117,6.585999965667725)
                lineTo(17.827999114990234,9.17199993133545)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,16.0)
                lineTo(20.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,21.0)
                lineTo(21.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,14.0)
                lineTo(9.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,21.0)
                lineTo(3.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5,16.5)
                lineTo(4.0,20.0)
            }
}

public val LucideIcons.All.SwordsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Swords: ImageVector
    @Composable get() = SwordsDefinition.asImageVector()
