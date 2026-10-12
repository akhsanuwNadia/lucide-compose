package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderClock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,14.0f)
                lineTo(16.0f,16.2f)
                lineTo(17.6f,17.2f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,20.0f)
                lineTo(4.0f,20.0f)
                curveTo(2.8954306f,20.0f,2.0f,19.10457f,2.0f,18.0f)
                lineTo(2.0f,5.0f)
                curveTo(2.0f,3.8954306f,2.8954306f,3.0f,4.0f,3.0f)
                lineTo(7.9f,3.0f)
                curveTo(8.579667f,2.9933364f,9.216198f,3.332317f,9.59f,3.9f)
                lineTo(10.400001f,5.1000004f)
                curveTo(10.769923f,5.6617208f,11.397414f,5.99989f,12.070001f,6.0000005f)
                lineTo(20.0f,6.0000005f)
                curveTo(21.104568f,6.0000005f,22.0f,6.8954306f,22.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,16.0f)
                curveTo(9.990385f,18.149986f,11.131871f,20.140781f,12.992228f,21.21856f)
                curveTo(14.852584f,22.296337f,17.147417f,22.296337f,19.007772f,21.21856f)
                curveTo(20.86813f,20.140781f,22.009615f,18.149986f,22.0f,16.0f)
                curveTo(22.009615f,13.850015f,20.86813f,11.859219f,19.007772f,10.781441f)
                curveTo(17.147417f,9.703663f,14.852584f,9.703663f,12.992228f,10.781441f)
                curveTo(11.131871f,11.859219f,9.990385f,13.850015f,10.0f,16.0f)
            }
}

public val LucideIcons.All.FolderClockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderClock: ImageVector
    @Composable get() = FolderClockDefinition.asImageVector()
