package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderSync") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0,20.0)
                lineTo(4.0,20.0)
                curveTo(2.895430564880371,20.0,2.0,19.104570388793945,2.0,18.0)
                lineTo(2.0,5.0)
                curveTo(2.0,3.895430564880371,2.895430564880371,3.0,4.0,3.0)
                lineTo(7.900000095367432,3.0)
                curveTo(8.579667091369629,2.9933364391326904,9.216197967529297,3.3323171138763428,9.59000015258789,3.9000000953674316)
                lineTo(10.40000057220459,5.100000381469727)
                curveTo(10.769923210144043,5.6617207527160645,11.397414207458496,5.999889850616455,12.070000648498535,6.000000476837158)
                lineTo(20.0,6.000000476837158)
                curveTo(21.104568481445312,6.000000476837158,22.0,6.895430564880371,22.0,8.0)
                lineTo(22.0,8.5)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,10.0)
                lineTo(12.0,14.0)
                lineTo(16.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,14.0)
                lineTo(13.53499984741211,12.395000457763672)
                curveTo(14.699687957763672,11.275638580322266,16.33341407775879,10.787928581237793,17.921133041381836,11.085625648498535)
                curveTo(19.50885009765625,11.383322715759277,20.85492706298828,12.4297456741333,21.53499984741211,13.895000457763672)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,22.0)
                lineTo(22.0,18.0)
                lineTo(18.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,18.0)
                lineTo(20.46500015258789,19.604999542236328)
                curveTo(19.300312042236328,20.724361419677734,17.66658592224121,21.212072372436523,16.078866958618164,20.91437530517578)
                curveTo(14.49114990234375,20.61667823791504,13.145072937011719,19.570255279541016,12.46500015258789,18.104999542236328)
            }
}

public val LucideIcons.All.FolderSyncDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderSync: ImageVector
    @Composable get() = FolderSyncDefinition.asImageVector()
