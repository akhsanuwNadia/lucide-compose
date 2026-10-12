package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClockArrowDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,6.0f)
                lineTo(12.0f,12.0f)
                lineTo(14.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.337f,21.994f)
                curveTo(8.151728f,22.13487f,4.321935f,19.653051f,2.7408f,15.775376f)
                curveTo(1.1596644f,11.897702f,2.1620958f,7.4455266f,5.2525635f,4.619689f)
                curveTo(8.343031f,1.7938513f,12.866923f,1.1929095f,16.587952f,3.1139266f)
                curveTo(20.308977f,5.034944f,22.438965f,9.071017f,21.925f,13.226999f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,18.0f)
                lineTo(18.0f,22.0f)
                lineTo(22.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,14.0f)
                lineTo(18.0f,22.0f)
            }
}

public val LucideIcons.All.ClockArrowDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClockArrowDown: ImageVector
    @Composable get() = ClockArrowDownDefinition.asImageVector()
