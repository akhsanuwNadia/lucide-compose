package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarClock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,14.0f)
                lineTo(16.0f,16.2f)
                lineTo(17.6f,17.2f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,2.0f)
                lineTo(16.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,7.338f)
                lineTo(21.0f,5.0f)
                curveTo(21.0f,3.8954306f,20.10457f,3.0f,19.0f,3.0f)
                lineTo(5.0f,3.0f)
                curveTo(3.8954306f,3.0f,3.0f,3.8954306f,3.0f,5.0f)
                lineTo(3.0f,19.0f)
                curveTo(3.0f,20.10457f,3.8954306f,21.0f,5.0f,21.0f)
                lineTo(7.3380003f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,9.0f)
                lineTo(8.859f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,2.0f)
                lineTo(8.0f,5.0f)
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

public val LucideIcons.All.CalendarClockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarClock: ImageVector
    @Composable get() = CalendarClockDefinition.asImageVector()
