package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TestTubes") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f,2.0f)
                lineTo(9.0f,19.5f)
                curveTo(9.0f,20.880713f,7.880712f,22.0f,6.5f,22.0f)
                curveTo(5.119288f,22.0f,4.0f,20.880713f,4.0f,19.5f)
                lineTo(4.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,2.0f)
                lineTo(20.0f,19.5f)
                curveTo(20.0f,20.880713f,18.880713f,22.0f,17.5f,22.0f)
                curveTo(16.119287f,22.0f,15.0f,20.880713f,15.0f,19.5f)
                lineTo(15.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,2.0f)
                lineTo(10.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(21.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,16.0f)
                lineTo(4.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,16.0f)
                lineTo(15.0f,16.0f)
            }
}

public val LucideIcons.All.TestTubesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TestTubes: ImageVector
    @Composable get() = TestTubesDefinition.asImageVector()
