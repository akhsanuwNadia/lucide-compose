package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Handshake") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,17.0)
                lineTo(13.0,19.0)
                curveTo(13.5350923538208,19.539899826049805,14.31816291809082,19.752227783203125,15.052696228027344,19.556583404541016)
                curveTo(15.787230491638184,19.360939025878906,16.360939025878906,18.787229537963867,16.556583404541016,18.052696228027344)
                curveTo(16.752227783203125,17.31816291809082,16.539899826049805,16.535093307495117,16.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,14.0)
                lineTo(16.5,16.5)
                curveTo(17.035093307495117,17.039899826049805,17.81816291809082,17.252227783203125,18.552696228027344,17.056583404541016)
                curveTo(19.287229537963867,16.860939025878906,19.860939025878906,16.287229537963867,20.056583404541016,15.552696228027344)
                curveTo(20.252227783203125,14.81816291809082,20.039899826049805,14.0350923538208,19.5,13.5)
                lineTo(15.619999885559082,9.619999885559082)
                curveTo(14.448729515075684,8.450186729431152,12.551270484924316,8.450186729431152,11.380000114440918,9.619999885559082)
                lineTo(10.5,10.5)
                curveTo(9.9649076461792,11.039899826049805,9.18183708190918,11.252227783203125,8.447303771972656,11.056583404541016)
                curveTo(7.712769508361816,10.86093807220459,7.139061450958252,10.287230491638184,6.943417072296143,9.552696228027344)
                curveTo(6.747772216796875,8.81816291809082,6.960099697113037,8.0350923538208,7.5,7.5)
                lineTo(10.309999465942383,4.690000057220459)
                curveTo(12.186756134033203,2.8181517124176025,15.094956398010254,2.459775686264038,17.369998931884766,3.820000171661377)
                lineTo(17.839998245239258,4.100000381469727)
                curveTo(18.265785217285156,4.356987476348877,18.772045135498047,4.446117401123047,19.259998321533203,4.350000381469727)
                lineTo(21.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,3.0)
                lineTo(22.0,14.0)
                lineTo(20.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,3.0)
                lineTo(2.0,14.0)
                lineTo(8.5,20.5)
                curveTo(9.0350923538208,21.039899826049805,9.81816291809082,21.252227783203125,10.552696228027344,21.056583404541016)
                curveTo(11.287230491638184,20.860939025878906,11.86093807220459,20.287229537963867,12.056583404541016,19.552696228027344)
                curveTo(12.252227783203125,18.81816291809082,12.039899826049805,18.035093307495117,11.5,17.5)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,4.0)
                lineTo(11.0,4.0)
            }
}

public val LucideIcons.All.HandshakeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Handshake: ImageVector
    @Composable get() = HandshakeDefinition.asImageVector()
