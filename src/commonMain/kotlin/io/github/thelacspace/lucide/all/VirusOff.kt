package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("VirusOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.010000228881836,10.0)
                lineTo(10.020000457763672,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,14.991000175476074)
                lineTo(12.010000228881836,14.991000175476074)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,22.0)
                lineTo(12.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,22.0)
                lineTo(11.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,2.0)
                lineTo(11.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5,19.79400062561035)
                lineTo(15.5,18.06100082397461)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5,4.204999923706055)
                lineTo(15.5,5.936999797821045)
            }
            lucidePath(strokeWidth) {
                moveTo(18.891000747680664,13.234999656677246)
                curveTo(19.29555320739746,10.97980785369873,18.570846557617188,8.66938591003418,16.950729370117188,7.049269676208496)
                curveTo(15.33061408996582,5.429153919219971,13.02019214630127,4.704446315765381,10.765000343322754,5.108999252319336)
            }
            lucidePath(strokeWidth) {
                moveTo(19.79400062561035,7.5)
                lineTo(18.062000274658203,8.5)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                lineTo(5.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,13.0)
                lineTo(2.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,12.0)
                lineTo(19.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,13.0)
                lineTo(22.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.205999851226807,16.5)
                lineTo(5.937999725341797,15.5)
            }
            lucidePath(strokeWidth) {
                moveTo(4.205999851226807,7.5)
                lineTo(5.937999725341797,8.5)
            }
            lucidePath(strokeWidth) {
                moveTo(7.050000190734863,7.050000190734863)
                curveTo(4.337018966674805,9.78735637664795,4.3468918800354,14.202716827392578,7.07208776473999,16.927913665771484)
                curveTo(9.797284126281738,19.653108596801758,14.212644577026367,19.662982940673828,16.950000762939453,16.950000762939453)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5,19.79400062561035)
                lineTo(8.5,18.06100082397461)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,12.0)
                lineTo(9.010000228881836,12.0)
            }
}

public val LucideIcons.All.VirusOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.VirusOff: ImageVector
    @Composable get() = VirusOffDefinition.asImageVector()
