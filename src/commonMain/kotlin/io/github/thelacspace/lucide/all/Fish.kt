package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Fish") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.5,12.0)
                curveTo(7.440000057220459,8.539999961853027,11.440000534057617,6.0,15.0,6.0)
                curveTo(18.559999465942383,6.0,21.059999465942383,8.539999961853027,22.0,12.0)
                curveTo(21.059999465942383,15.470000267028809,18.559999465942383,18.0,15.0,18.0)
                curveTo(11.440000534057617,18.0,7.440000057220459,15.470000267028809,6.5,12.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,12.0)
                lineTo(18.0,12.5)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,17.93000030517578)
                curveTo(13.32604694366455,14.428818702697754,13.32604694366455,9.571182250976562,16.0,6.070000648498535)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,10.670000076293945)
                curveTo(7.0,8.0,5.579999923706055,5.96999979019165,2.7300000190734863,5.5)
                curveTo(1.7300000190734863,7.0,1.7300000190734863,10.5,2.9600000381469727,12.0)
                curveTo(1.7200000286102295,13.5,1.7200000286102295,17.0,2.7300000190734863,18.5)
                curveTo(5.579999923706055,18.030000686645508,7.0,16.0,7.0,13.329999923706055)
            }
            lucidePath(strokeWidth) {
                moveTo(10.460000038146973,7.260000228881836)
                curveTo(10.199999809265137,5.880000114440918,9.170000076293945,4.239999771118164,8.0,3.0)
                lineTo(13.800000190734863,3.0)
                curveTo(14.780019760131836,2.996368408203125,15.618303298950195,3.7034058570861816,15.780000686645508,4.670000076293945)
                lineTo(16.010000228881836,6.070000171661377)
            }
            lucidePath(strokeWidth) {
                moveTo(16.010000228881836,17.93000030517578)
                lineTo(15.780000686645508,19.329999923706055)
                curveTo(15.618303298950195,20.296594619750977,14.780019760131836,21.003631591796875,13.800000190734863,21.0)
                lineTo(9.5,21.0)
                curveTo(10.468850135803223,19.901493072509766,10.999263763427734,18.48468589782715,10.989999771118164,17.020000457763672)
            }
}

public val LucideIcons.All.FishDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Fish: ImageVector
    @Composable get() = FishDefinition.asImageVector()
