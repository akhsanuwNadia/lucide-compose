package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TestTubes") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0,2.0)
                lineTo(9.0,19.5)
                curveTo(9.0,20.880712509155273,7.880712032318115,22.0,6.5,22.0)
                curveTo(5.119287967681885,22.0,4.0,20.880712509155273,4.0,19.5)
                lineTo(4.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,2.0)
                lineTo(20.0,19.5)
                curveTo(20.0,20.880712509155273,18.880712509155273,22.0,17.5,22.0)
                curveTo(16.119287490844727,22.0,15.0,20.880712509155273,15.0,19.5)
                lineTo(15.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,2.0)
                lineTo(10.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(21.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,16.0)
                lineTo(4.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,16.0)
                lineTo(15.0,16.0)
            }
}

public val LucideIcons.All.TestTubesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TestTubes: ImageVector
    @Composable get() = TestTubesDefinition.asImageVector()
