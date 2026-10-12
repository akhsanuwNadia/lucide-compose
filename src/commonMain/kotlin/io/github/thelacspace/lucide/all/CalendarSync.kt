package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarSync") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,10.0)
                lineTo(11.0,14.0)
                lineTo(15.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,14.0)
                lineTo(12.53499984741211,12.395000457763672)
                curveTo(13.699687957763672,11.275638580322266,15.333415031433105,10.787928581237793,16.921133041381836,11.085625648498535)
                curveTo(18.50885009765625,11.383322715759277,19.85492706298828,12.4297456741333,20.53499984741211,13.895000457763672)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,2.0)
                lineTo(16.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,18.0)
                lineTo(19.46500015258789,19.604999542236328)
                curveTo(18.300312042236328,20.724361419677734,16.66658592224121,21.212072372436523,15.078866958618164,20.91437530517578)
                curveTo(13.49114990234375,20.61667823791504,12.145072937011719,19.570255279541016,11.46500015258789,18.104999542236328)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,22.0)
                lineTo(21.0,18.0)
                lineTo(17.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,8.517000198364258)
                lineTo(21.0,5.0)
                curveTo(21.0,3.895430564880371,20.104570388793945,3.0,19.0,3.0)
                lineTo(5.0,3.0)
                curveTo(3.895430564880371,3.0,3.0,3.895430564880371,3.0,5.0)
                lineTo(3.0,19.0)
                curveTo(3.0,20.104570388793945,3.895430564880371,21.0,5.0,21.0)
                lineTo(8.517000198364258,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,9.0)
                lineTo(7.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,2.0)
                lineTo(8.0,5.0)
            }
}

public val LucideIcons.All.CalendarSyncDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarSync: ImageVector
    @Composable get() = CalendarSyncDefinition.asImageVector()
