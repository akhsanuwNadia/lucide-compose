package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClockArrowLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,6.0f)
                lineTo(12.0f,12.0f)
                lineTo(13.5f,12.8f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.338f,21.994f)
                curveTo(8.152653f,22.135294f,4.3225484f,19.653753f,2.7410836f,15.776116f)
                curveTo(1.1596189f,11.89848f,2.1617894f,7.446132f,5.252176f,4.6200733f)
                curveTo(8.342563f,1.7940152f,12.866541f,1.1928786f,16.5877f,3.1138334f)
                curveTo(20.30886f,5.0347886f,22.438963f,9.070927f,21.925f,13.226999f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,18.0f)
                lineTo(22.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,22.0f)
                lineTo(14.0f,18.0f)
                lineTo(18.0f,14.0f)
            }
}

public val LucideIcons.All.ClockArrowLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClockArrowLeft: ImageVector
    @Composable get() = ClockArrowLeftDefinition.asImageVector()
