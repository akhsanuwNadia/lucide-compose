package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Satellite") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.5,6.5)
                lineTo(10.35200023651123,3.3519999980926514)
                curveTo(9.881433486938477,2.8815033435821533,9.11856746673584,2.8815033435821533,8.648000717163086,3.3519999980926514)
                lineTo(6.3520002365112305,5.6479997634887695)
                curveTo(5.881503582000732,6.118566989898682,5.881503582000732,6.88143253326416,6.3520002365112305,7.351999759674072)
                lineTo(9.5,10.5)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5,7.5)
                lineTo(19.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.5,10.5)
                lineTo(20.648000717163086,13.64799976348877)
                curveTo(21.118497848510742,14.118566513061523,21.118497848510742,14.88143253326416,20.648000717163086,15.351999282836914)
                lineTo(18.352001190185547,17.647998809814453)
                curveTo(17.881433486938477,18.11849594116211,17.118568420410156,18.11849594116211,16.648000717163086,17.647998809814453)
                lineTo(13.5,14.5)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,21.0)
                curveTo(9.0,17.686290740966797,6.313708305358887,15.0,3.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.35200023651123,10.64799976348877)
                curveTo(8.88150405883789,11.118566513061523,8.88150405883789,11.88143253326416,9.35200023651123,12.351999282836914)
                lineTo(11.648000717163086,14.647998809814453)
                curveTo(12.118568420410156,15.11849594116211,12.881433486938477,15.11849594116211,13.352001190185547,14.647998809814453)
                lineTo(17.648000717163086,10.351999282836914)
                curveTo(18.118497848510742,9.881431579589844,18.118497848510742,9.118566513061523,17.648000717163086,8.647998809814453)
                lineTo(15.352001190185547,6.351998805999756)
                curveTo(14.881433486938477,5.8815016746521,14.118568420410156,5.8815016746521,13.648000717163086,6.351998805999756)
                close()
            }
}

public val LucideIcons.All.SatelliteDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Satellite: ImageVector
    @Composable get() = SatelliteDefinition.asImageVector()
